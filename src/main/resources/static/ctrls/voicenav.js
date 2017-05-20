var fillingForm = false;
var currForm = null;
var lastInput = 0;
var lastCheckbox = -1;
var currVideo = null;
var lastParagraph = [0, 0, 0, 0, 0, 0];
var lastDeep = 1;

function parseNum(num) {
  switch(num) {
    case 'pierwszego': return 1;
    case 'drugiego': return 2;
    case 'trzeciego': return 3;
    case 'czwartego': return 4;
    case 'piątego': return 5;
    case 'szóstego': return 6;
    default: return num;
  }
}

function startVoiceInterface() {
  if(annyang) {
    if(annyang.isListening()) {
      annyang.abort();
      console.log('Voice interface deactivated.');
      $("#microphone-state").text("Wyłączona");
      $("#micbutt").attr("src", "../img/microoff.png");
      return;
    }

    annyang.setLanguage("pl");

    var commands = {
      'akapit :akapit': function(akapit) {
        var element = $('h'+lastDeep)[akapit-1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[lastDeep-1] = akapit-1;
      },
      'następny akapit': function() {
        var element = $('h'+lastDeep)[lastParagraph[lastDeep-1]+1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[lastDeep-1] = lastParagraph[lastDeep-1]+1;
      },
      'poprzedni akapit': function() {
        var element = $('h'+lastDeep)[lastParagraph[lastDeep-1]-1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[lastDeep-1] = lastParagraph[lastDeep-1]-1;
      },
      'akapit :stopien stopnia :akapit': function(stopien, akapit) {
        stopien = parseNum(stopien);
        var element = $('h'+stopien)[akapit-1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[stopien-1] = akapit-1;
        lastDeep = stopien;
      },
      'następny akapit wyższego stopnia': function() {
        if(lastDeep == 6) return;
        stopien = lastDeep+1;
        var element = $('h'+stopien)[lastParagraph[stopien-1]+1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[stopien-1] ++;
        lastDeep = stopien;
      },
      'następny akapit niższego stopnia': function() {
        if(lastDeep == 1) return;
        stopien = lastDeep-1;
        var element = $('h'+stopien)[lastParagraph[stopien-1]+1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[stopien-1] ++;
        lastDeep = stopien;
      },
      'poprzedni akapit wyższego stopnia': function() {
        if(lastDeep == 6) return;
        stopien = lastDeep+1;
        var element = $('h'+stopien)[lastParagraph[stopien-1]-1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[stopien-1] --;
        lastDeep = stopien;
      },
      'poprzedni akapit niższego stopnia': function() {
        if(lastDeep == 1) return;
        stopien = lastDeep-1;
        var element = $('h'+stopien)[lastParagraph[stopien-1]-1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[stopien-1] --;
        lastDeep = stopien;
      },
      'następny akapit :stopien stopnia': function(stopien) {
        stopien = parseNum(stopien);
        var element = $('h'+stopien)[lastParagraph[stopien-1]+1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[stopien-1] ++;
        lastDeep = stopien;
      },
      'poprzedni akapit :stopien stopnia': function(stopien) {
        stopien = parseNum(stopien);
        var element = $('h'+stopien)[lastParagraph[stopien-1]-1];
        $('html,body').animate({scrollTop: $(element).offset().top});
        lastParagraph[stopien-1] --;
        lastDeep = stopien;
      },
      /*'akapit *akapit': function(akapit) {
        var element = $('h1, h2, h3, h4, h5, h6').filter(function(){ return $(this).text().toLowerCase() === akapit;});
        if(typeof element.offset() !== 'undefined') $('html,body').animate({scrollTop: element.offset().top});
        else {
          element = $('h1, h2, h3, h4, h5, h6').filter(function(){ return $(this).text() === akapit;});
          if(typeof element.offset() !== 'undefined') $('html,body').animate({scrollTop: element.offset().top});
          else {
            element = $('*').filter(function(){ return $(this).text().toLowerCase() === akapit;});
            if(typeof element.offset() !== 'undefined') $('html,body').animate({scrollTop: element.offset().top});
            else {
              element = $('*:contains("'+akapit+'")')[0];
              if(typeof element !== 'undefined') $('html,body').animate({scrollTop: element.offset().top});
              else {
                element = $('*:contains("'+akapit.toUpperCase()+'")')[0];
                if(typeof element !== 'undefined') $('html,body').animate({scrollTop: element.offset().top});
                else {
                  element = $('*:contains("'+akapit[0].toUpperCase()+akapit.slice(1)+'")')[0];
                  if(typeof element !== 'undefined') $('html,body').animate({scrollTop: element.offset().top});
                }
              }
            }
          }
        }
        /*var element = $('h1, h2, h3, h4, h5, h6').filter(function(){ return $(this).text().toLowerCase() === akapit;});
        $.scrollTo(element);
        element = $('h1, h2, h3, h4, h5, h6').filter(function(){ return $(this).text() === akapit;});
        $.scrollTo(element);
        element = $('*').filter(function(){ return $(this).text().toLowerCase() === akapit;});
        $.scrollTo(element);
        element = $('*').filter(function(){ return $(this).text() === akapit;});
        $.scrollTo(element);
      },*/
      'formularz': function() {
        fillForm(0);
      },
      'formularz :index': function(index) {
        fillForm(index-1);
      },
      'napisz w :index *text': function(index, text) {
        writeInput(index-1, text);
      },
      'napisz następne *text': function(text) {
        writeInput(lastInput+1, text)
      },
      'napisz *text': function(text) {
        writeInput(lastInput, text);
      },
      'zaznacz następne': function(pole) {
        checkInput(lastCheckbox+1, true);
      },
      'odznacz następne': function(pole) {
        checkInput(lastCheckbox+1, false);
      },
      'zaznacz *pole': function(pole) {
        checkInput(pole, true);
      },
      'odznacz *pole': function(pole) {
        checkInput(pole, false);
      },
      'zaznacz': function() {
        checkInput(lastCheckbox, true);
      },
      'odznacz': function() {
        checkInput(lastCheckbox, false);
      },
      'wciśnij *przycisk': function(przycisk) {
          var element = $('a').filter(function(){ return $(this).text().toLowerCase() === przycisk});
          if(typeof element.attr('href') !== 'undefined') window.location.replace(element.attr('href'));
          element = $('a').filter(function(){ return $(this).text().charAt(0).toUpperCase() + $(this).text().slice(1).toLowerCase() === przycisk});
          if(typeof element.attr('href') !== 'undefined') window.location.replace(element.attr('href'));

          element = $('button, md-button').filter(function(){ return $(this).text().toLowerCase() === przycisk});
          element.click();
          element = $('button, md-button').filter(function(){ return $(this).text().charAt(0).toUpperCase() + $(this).text().slice(1).toLowerCase() === przycisk});
          element.click();
      },
      'wyczyść :pole': function(pole) {
        writeInput(pole-1, '');
      },
      'wyczyść': function() {
        writeInput(lastInput, '');
      },
      'przybliżenie :proc': function(proc) {
        $('body').css({
                zoom: proc / 100
            });
      },
      'odtwórz wideo': function() {
        playVid(0);
      },
      'odtwórz wideo :index': function(index) {
        playVid(index-1);
      },
      'zatrzymaj wideo': function() {
        stopVid(currVideo);
      },
      'zatrzymaj wideo :index': function() {
        stopVid(index);
      },
      'głośność wideo :perc': function(perc) {
        if(currVideo != null) {
          $('video')[currVideo].volume = perc / 100;
        }
      },
      'przewiń w dół': function() {
        var y = $(window).scrollTop();
        $("html, body").animate({ scrollTop: y + $(window).height() }, 600);
      },
      'przewiń w górę': function() {
        $("html, body").animate({ scrollTop:0 }, 600);
      },
      'w dół': function() {
        var y = $(window).scrollTop();
        $("html, body").animate({ scrollTop: y + 150 }, 600);
      },
      'w górę': function() {
        var y = $(window).scrollTop();
        $("html, body").animate({ scrollTop: y - 150 }, 600);
      },
      'w dół :lines': function(lines) {
        var y = $(window).scrollTop();
        $("html, body").animate({ scrollTop: y + lines * parseInt($('body').css('font-size')) * $('body').css('zoom') }, 600);
      },
      'w górę :lines': function(lines) {
        var y = $(window).scrollTop();
        $("html, body").animate({ scrollTop: y - lines * parseInt($('body').css('font-size')) * $('body').css('zoom') }, 600);
      }
    };

    annyang.addCommands(commands);

    annyang.addCallback('error', function() {
             console.log('There was an error in Annyang!');
    });

    annyang.addCallback('soundstart', function() {
        $("#microphone-state").text("Włączona - słucha");
        $("#micbutt").attr("src", "../img/microlisten.png");
    });

      annyang.addCallback('resultMatch', function() {
          $("#microphone-state").text("Włączona - czeka");
          $("#micbutt").attr("src", "../img/microon.png");
      });

      annyang.addCallback('resultNoMatch', function() {
          $("#microphone-state").text("Włączona - czeka");
          $("#micbutt").attr("src", "../img/microon.png");
      });

    annyang.start({ autoRestart: true, continuous: false });
    annyang.debug();

    console.log('Voice interface initialised.');
      $("#microphone-state").text("Włączona - czeka");
      $("#micbutt").attr("src", "../img/microon.png");
  }
}

function fillForm(index) {
  var form = $('form')[index];

  if(form == 'undefined') console.log('Nie ma takiego formularza');
  else {
    $('html,body').animate({scrollTop: $(form).offset().top});

    fillingForm = true;
    currForm = form;
    lastInput = 0;
    lastCheckbox = 0;
  }

  console.log('Wybrano nowy formularz');
}

function writeInput(index, text) {
    var input;
    do {
      if(fillingForm) input  = currForm.getElementsByTagName('input')[index];
      else input = $('input')[index];
      index ++;
      if(typeof input === 'undefined') {
        break;
      }
    }while(input.getAttribute("type") != "text")
    index --;

    if(typeof input === 'undefined') console.log('Nie ma takiego pola');
    else {
      input.value = text;

      lastInput = index;

      console.log('Wpisano tekst. Last input: ' + lastInput);
    }
}

function checkInput(index, check) {
  if(!fillingForm) console.log('Żaden formularz nie jest wybrany.')
  else {
    var input;
    do {
      input  = currForm.getElementsByTagName('input')[index];
      index ++;
      console.log(input.getAttribute("type"));
      if(typeof input === 'undefined') {
        break;
      }
    }while(input.getAttribute("type") != "checkbox")
    index --;

    if(typeof input === 'undefined') console.log('Ten formularz nie ma takiego pola');
    else {
      input.checked = check;

      lastCheckbox = index;

      console.log('Ustawiono pole na ' + check);
    }
  }
}

function playVid(index) {
  var movie = $('video')[index];
  if(typeof movie === 'undefined') console.log('Nie ma takiego wideo.');
  else {
    movie.play();
    currVideo = index;
  }
}

function stopVid(index) {
  var movie = $('video')[index];
  if(typeof movie === 'undefined') console.log('Nie ma takiego wideo.');
  else {
    movie.pause();
  }
}
