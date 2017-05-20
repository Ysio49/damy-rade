package com.noname.controller;

import com.noname.database.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class DataBaseInitController {

    @Autowired
    JobOfferRepository jobOfferRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    EmployerRepository employerRepository;

    @RequestMapping("/database")
    public void initDatabase() {
        this.initUser();
        this.initOffers();
        this.initCompany();
    }

    private void initUser() {
        System.out.println("jestem tutaj");
        User user = new User();
        user.setFirstName("Test");
        user.setLastName("User");
        user.setBirthDate("16.01.1991");
        user.setTelephone("777888999");
        user.setAbout("OMnomNomnomnomnomnomnomomnomnomnomnomnNOM dasdsa dsa dsa dsa");
        user.setPassword("password");
        user.setEmailAddress("test@example.com");
        user.setImg("sciezkaDoImg");
        user.setCity("Poznan");
        user.setPostcode("99-99");
        user.setStreet("Piekna");
        user.setHomeNumber("123/23");

        user.setCertificates("Certyfikat moczymordy, Melanżowanie");
        user.setEducationLevel("wykształcenie średnie");
        user.setUniversity("UAM");
        user.setSkills("Komputery, Picie piwa, Gówno gówno");

        user.setOffersApplied("1,3");
        user.setOffersWatched("3");
        user.setPortfolioUrl("https://www.linkedin.com/in/michalkurkowski/");

        userRepository.save(user);

    }
    private void initOffers() {
        JobOffer jobOffer = new JobOffer();
        jobOffer.setCompanyId(1L);
        jobOffer.setDescription("Dobra praca od zaraz");
        jobOffer.setField("it");
        jobOffer.setImg("testImg");
        jobOffer.setRegion("mazowieckie");
        jobOffer.setCity("Warszawa");
        jobOffer.setJobType("Biurowa");
        jobOffer.setContractType("umowa o dzieło");
        jobOffer.setTimeType("pół etatu");
        jobOffer.setSalary("2550");
        jobOffer.setAddedDate("28.04.2017");
        jobOffer.setExpireDate("1.07.2017");
        jobOffer.setSkills("Office, Komputery");
        jobOffer.setBonuses("Ubezpieczenie, Prywatna opieka medyczna, Karta Intersport");
        jobOffer.setTitle("Praca biurowa od zaraz");
        jobOfferRepository.save(jobOffer);

        JobOffer jobOffer2 = new JobOffer();
        jobOffer2.setCompanyId(1L);
        jobOffer2.setDescription("Pracownik apteki na ul.Głogowskiej w Poznaniu");
        jobOffer2.setField("farmaceutyczna");
        jobOffer2.setImg("testImg");
        jobOffer2.setRegion("wielkopolskie");
        jobOffer2.setCity("Poznań");
        jobOffer2.setJobType("Farmaceutyczna");
        jobOffer2.setContractType("umowa o prace");
        jobOffer2.setTimeType("pełen etat");
        jobOffer2.setSalary("4000");
        jobOffer2.setAddedDate("30.05.2017");
        jobOffer2.setExpireDate("1.08.2017");
        jobOffer2.setSkills("Farmaceutyka, Medyczna");
        jobOffer2.setBonuses("Ubezpieczenie, Prywatna opieka medyczna, Zniżki na leki");
        jobOffer2.setTitle("Poszukiwany pracownik apteki");
        jobOfferRepository.save(jobOffer2);

        JobOffer jobOffer3 = new JobOffer();
        jobOffer3.setCompanyId(1L);
        jobOffer3.setDescription("Praca za kasą w sklepie wielobranżowym na Jeżycach");
        jobOffer3.setField("usługi");
        jobOffer3.setImg("testImg");
        jobOffer3.setRegion("wielkopolskie");
        jobOffer3.setCity("Poznań");
        jobOffer3.setJobType("Usługi");
        jobOffer3.setContractType("umowa o prace");
        jobOffer3.setTimeType("pełen etat, poł etatu");
        jobOffer3.setSalary("2890");
        jobOffer3.setAddedDate("13.05.2017");
        jobOffer3.setExpireDate("15.07.2017");
        jobOffer3.setSkills("Obsługiwanie klientów, sprzedaż i rozładunek towaru");
        jobOffer3.setBonuses("Ubezpieczenie");
        jobOffer3.setTitle("Kasjer/kasjerka w sklepie wielobranżowym");
        jobOfferRepository.save(jobOffer3);

        JobOffer jobOffer4 = new JobOffer();
        jobOffer4.setCompanyId(1L);
        jobOffer4.setDescription("Ciekawa praca na pełen etat na budowie");
        jobOffer4.setField("fizyczna");
        jobOffer4.setImg("testImg");
        jobOffer4.setRegion("wielkopolskie");
        jobOffer4.setCity("Poznań");
        jobOffer4.setJobType("Fizyczna");
        jobOffer4.setContractType("umowa o prace");
        jobOffer4.setTimeType("pełen etat");
        jobOffer4.setSalary("3000");
        jobOffer4.setAddedDate("2.04.2017");
        jobOffer4.setExpireDate("1.06.2017");
        jobOffer4.setSkills("Budownictwo, Instalacje");
        jobOffer4.setBonuses("Ubezpieczenie, Prywatna opieka medyczna, Karta intersport");
        jobOffer4.setTitle("Poszukiwany pracownik budowy od zaraz");
        jobOfferRepository.save(jobOffer4);

        JobOffer jobOffer5 = new JobOffer();
        jobOffer5.setCompanyId(1L);
        jobOffer5.setDescription("Ciekawa praca dla osób ciekawych wrażeń");
        jobOffer5.setField("usługi");
        jobOffer5.setImg("testImg");
        jobOffer5.setRegion("wielkopolskie");
        jobOffer5.setCity("Poznań");
        jobOffer5.setJobType("Usługi");
        jobOffer5.setContractType("umowa o prace");
        jobOffer5.setTimeType("pełen etat");
        jobOffer5.setSalary("5500");
        jobOffer5.setAddedDate("20.05.2017");
        jobOffer5.setExpireDate("9.09.2017");
        jobOffer5.setSkills("Łatwa komunikacja z ludźmi");
        jobOffer5.setBonuses("Ubezpieczenie, Prywatna opieka medyczna");
        jobOffer5.setTitle("Stewardessa na lotach europejskich");
        jobOfferRepository.save(jobOffer5);

        JobOffer jobOffer6 = new JobOffer();
        jobOffer6.setCompanyId(1L);
        jobOffer6.setDescription("Praca z domu, dobrze płatna");
        jobOffer6.setField("Grafika komputerowa");
        jobOffer6.setImg("testImg");
        jobOffer6.setRegion("wielkopolskie");
        jobOffer6.setCity("Poznań");
        jobOffer6.setJobType("Zdalna");
        jobOffer6.setContractType("umowa o dzieło");
        jobOffer6.setTimeType("pełen etat");
        jobOffer6.setSalary("3900");
        jobOffer6.setAddedDate("25.05.2017");
        jobOffer6.setExpireDate("1.08.2017");
        jobOffer6.setSkills("Illustrator, Photoshop");
        jobOffer6.setBonuses("Ubezpieczenie");
        jobOffer6.setTitle("Poszukiwany grafik komputerowy do firmy reklamowej w Poznaniu");
        jobOfferRepository.save(jobOffer6);

        JobOffer jobOffer7 = new JobOffer();
        jobOffer7.setCompanyId(1L);
        jobOffer7.setDescription("Praca od zaraz");
        jobOffer7.setField("fizyczna");
        jobOffer7.setImg("testImg");
        jobOffer7.setRegion("wielkopolskie");
        jobOffer7.setCity("Poznań");
        jobOffer7.setJobType("Fizyczna");
        jobOffer7.setContractType("umowa o prace");
        jobOffer7.setTimeType("pełen etat");
        jobOffer7.setSalary("3000");
        jobOffer7.setAddedDate("9.05.2017");
        jobOffer7.setExpireDate("9.07.2017");
        jobOffer7.setSkills("Obsługiwanie koparki");
        jobOffer7.setBonuses("Ubezpieczenie, Prywatna opieka medyczna");
        jobOffer7.setTitle("Szukam operatora koparki na wysokościach");
        jobOfferRepository.save(jobOffer7);

        JobOffer jobOffer8 = new JobOffer();
        jobOffer8.setCompanyId(1L);
        jobOffer8.setDescription("Zatrudnię od zaraz opiekunkę do 3-letniego dziecka");
        jobOffer8.setField("inne");
        jobOffer8.setImg("testImg");
        jobOffer8.setRegion("mazowieckie");
        jobOffer8.setCity("Warszawa");
        jobOffer8.setJobType("inne");
        jobOffer8.setContractType("umowa o zlecenie");
        jobOffer8.setTimeType("pół etatu");
        jobOffer8.setSalary("2300");
        jobOffer8.setAddedDate("20.05.2017");
        jobOffer8.setExpireDate("1.08.2017");
        jobOffer8.setSkills("Praca z dziećmi, Pedagogika");
        jobOffer8.setBonuses("Ubezpieczenie");
        jobOffer8.setTitle("Zatrudnię opiekunkę do dziecka!");
        jobOfferRepository.save(jobOffer8);

        JobOffer jobOffer9 = new JobOffer();
        jobOffer9.setCompanyId(1L);
        jobOffer9.setDescription("Ciekawa praca w miłej atmosferze");
        jobOffer9.setField("usługi");
        jobOffer9.setImg("testImg");
        jobOffer9.setRegion("wielkopolskie");
        jobOffer9.setCity("Poznań");
        jobOffer9.setJobType("usługi");
        jobOffer9.setContractType("umowa o pracę");
        jobOffer9.setTimeType("pełen etat");
        jobOffer9.setSalary("3400");
        jobOffer9.setAddedDate("29.04.2017");
        jobOffer9.setExpireDate("1.09.2017");
        jobOffer9.setSkills("Znajomość rodzajów kwiatów, Umiejętności manualne");
        jobOffer9.setBonuses("Ubezpieczenie");
        jobOffer9.setTitle("Poszukiwany pracownik kwiaciarni 'Kwiaty i Miut' na Jeżycach w Poznaniu");
        jobOfferRepository.save(jobOffer9);

        JobOffer jobOffer10 = new JobOffer();
        jobOffer10.setCompanyId(1L);
        jobOffer10.setDescription("Praca od ręki");
        jobOffer10.setField("usługi");
        jobOffer10.setImg("testImg");
        jobOffer10.setRegion("wielkopolskie");
        jobOffer10.setCity("Poznań");
        jobOffer10.setJobType("Usługi");
        jobOffer10.setContractType("umowa o pracę");
        jobOffer10.setTimeType("pół etatu");
        jobOffer10.setSalary("2500");
        jobOffer10.setAddedDate("20.05.2017");
        jobOffer10.setExpireDate("1.08.2017");
        jobOffer10.setSkills("Obsługa kasy fiskalnej, Umiejętność robienia drinków, ciekawa osobowość");
        jobOffer10.setBonuses("Ubezpieczenie");
        jobOffer10.setTitle("Barman na pół etatu potrzebny w lokalu przy starym rynku w Poznaniu");
        jobOfferRepository.save(jobOffer10);

        JobOffer jobOffer11 = new JobOffer();
        jobOffer11.setCompanyId(1L);
        jobOffer11.setDescription("Praca na pół etatu od września");
        jobOffer11.setField("edukacyjna");
        jobOffer11.setImg("testImg");
        jobOffer11.setRegion("wielkopolskie");
        jobOffer11.setCity("Poznań");
        jobOffer11.setJobType("Nauczyciel");
        jobOffer11.setContractType("umowa o pracę");
        jobOffer11.setTimeType("pół etatu");
        jobOffer11.setSalary("2700");
        jobOffer11.setAddedDate("20.05.2017");
        jobOffer11.setExpireDate("9.12.2017");
        jobOffer11.setSkills("Praca z dziećmi, Pedagogika, Nauczanie w szkołach podstawowych");
        jobOffer11.setBonuses("Ubezpieczenie");
        jobOffer11.setTitle("Potrzebna nauczycielka angielskiego w Szkole Podstawowej na Os.Lecha w Poznaniu");
        jobOfferRepository.save(jobOffer11);

        JobOffer jobOffer12 = new JobOffer();
        jobOffer12.setCompanyId(1L);
        jobOffer12.setDescription("Zatrudnię na pełen etat tresera delfinów");
        jobOffer12.setField("inne");
        jobOffer12.setImg("testImg");
        jobOffer12.setRegion("wielkopolskie");
        jobOffer12.setCity("Poznań");
        jobOffer12.setJobType("Tresura zwierząt");
        jobOffer12.setContractType("umowa o pracę");
        jobOffer12.setTimeType("pełen etat");
        jobOffer12.setSalary("4000");
        jobOffer12.setAddedDate("23.05.2017");
        jobOffer12.setExpireDate("30.10.2017");
        jobOffer12.setSkills("Praca ze zwierzętami, Pływanie");
        jobOffer12.setBonuses("Ubezpieczenie, Karta intersport");
        jobOffer12.setTitle("Treser delfinów poszukiwany do Nowego Zoo w Poznaniu");
        jobOfferRepository.save(jobOffer12);

        JobOffer jobOffer13 = new JobOffer();
        jobOffer13.setCompanyId(1L);
        jobOffer13.setDescription("Praca od zaraz");
        jobOffer13.setField("Transport");
        jobOffer13.setImg("testImg");
        jobOffer13.setRegion("wielkopolskie");
        jobOffer13.setCity("Poznań");
        jobOffer13.setJobType("Transport");
        jobOffer13.setContractType("umowa o pracę");
        jobOffer13.setTimeType("pełen etat");
        jobOffer13.setSalary("4100");
        jobOffer13.setAddedDate("15.05.2017");
        jobOffer13.setExpireDate("1.11.2017");
        jobOffer13.setSkills("Obsługa tramwaju");
        jobOffer13.setBonuses("Ubezpieczenie, Prywatna opieka zdrowotna, Karta intersport");
        jobOffer13.setTitle("Motorniczy tramwaju");
        jobOfferRepository.save(jobOffer13);

        JobOffer jobOffer14 = new JobOffer();
        jobOffer14.setCompanyId(1L);
        jobOffer14.setDescription("Praca od zaraz");
        jobOffer14.setField("inne");
        jobOffer14.setImg("testImg");
        jobOffer14.setRegion("mazowieckie");
        jobOffer14.setCity("Warszawa");
        jobOffer14.setJobType("inne");
        jobOffer14.setContractType("umowa o dzieło");
        jobOffer14.setTimeType("pół etatu");
        jobOffer14.setSalary("1900");
        jobOffer14.setAddedDate("20.05.2017");
        jobOffer14.setExpireDate("1.08.2017");
        jobOffer14.setSkills("Granie w gry");
        jobOffer14.setBonuses("-");
        jobOffer14.setTitle("Mistrz RPG");
        jobOfferRepository.save(jobOffer14);

        JobOffer jobOffer15 = new JobOffer();
        jobOffer15.setCompanyId(1L);
        jobOffer15.setDescription("Piosenka");
        jobOffer15.setField("inne");
        jobOffer15.setImg("testImg");
        jobOffer15.setRegion("mazowieckie");
        jobOffer15.setCity("Poznań");
        jobOffer15.setJobType("inne");
        jobOffer15.setContractType("umowa o zlecenie");
        jobOffer15.setTimeType("pół etatu");
        jobOffer15.setSalary("2300");
        jobOffer15.setAddedDate("20.05.2017");
        jobOffer15.setExpireDate("1.08.2017");
        jobOffer15.setSkills("Pranie ubrań i koców");
        jobOffer15.setBonuses("-");
        jobOffer15.setTitle("Szukam praczki na mazowszu");
        jobOfferRepository.save(jobOffer15);

        JobOffer jobOffer16 = new JobOffer();
        jobOffer16.setCompanyId(1L);
        jobOffer16.setDescription("Szybka praca od ręki");
        jobOffer16.setField("fizyczna");
        jobOffer16.setImg("testImg");
        jobOffer16.setRegion("wielkopolskie");
        jobOffer16.setCity("Poznań");
        jobOffer16.setJobType("inne");
        jobOffer16.setContractType("umowa o zlecenie");
        jobOffer16.setTimeType("pół etatu");
        jobOffer16.setSalary("2000");
        jobOffer16.setAddedDate("20.05.2017");
        jobOffer16.setExpireDate("20.08.2017");
        jobOffer16.setSkills("Umiejętne sprzątanie");
        jobOffer16.setBonuses("-");
        jobOffer16.setTitle("Szukam sprzątaczki pracującej w weekendy");
        jobOfferRepository.save(jobOffer16);

        JobOffer jobOffer17 = new JobOffer();
        jobOffer17.setCompanyId(1L);
        jobOffer17.setDescription("Zatrudnię pracownika fabryki od ręki");
        jobOffer17.setField("fizyczna");
        jobOffer17.setImg("testImg");
        jobOffer17.setRegion("wielkopolskie");
        jobOffer17.setCity("Poznań");
        jobOffer17.setJobType("Pracownik fabryki");
        jobOffer17.setContractType("umowa o pracę");
        jobOffer17.setTimeType("pełen etat");
        jobOffer17.setSalary("2500");
        jobOffer17.setAddedDate("1.04.2017");
        jobOffer17.setExpireDate("1.09.2017");
        jobOffer17.setSkills("Szybka motoryka rąk");
        jobOffer17.setBonuses("Ubezpieczenie, Prywatna opieka zdrowotna");
        jobOffer17.setTitle("Poszukiwany składacz długopisów i mazaków w fabryce na Franowie");
        jobOfferRepository.save(jobOffer17);

        JobOffer jobOffer18 = new JobOffer();
        jobOffer18.setCompanyId(1L);
        jobOffer18.setDescription("Praca na pełen etat");
        jobOffer18.setField("medyczna");
        jobOffer18.setImg("testImg");
        jobOffer18.setRegion("wielkopolskie");
        jobOffer18.setCity("Poznań");
        jobOffer18.setJobType("Lekarz rodzinny");
        jobOffer18.setContractType("umowa o dzieło");
        jobOffer18.setTimeType("pół etatu");
        jobOffer18.setSalary("4500");
        jobOffer18.setAddedDate("10.05.2017");
        jobOffer18.setExpireDate("10.09.2017");
        jobOffer18.setSkills("Medycyna, Cierpliwość");
        jobOffer18.setBonuses("Ubezpieczenie, Prywatna opieka medyczna");
        jobOffer18.setTitle("Potrzebny ekarz rodzinny w szpitalu na Osiedlu Rusa w Poznaniu");
        jobOfferRepository.save(jobOffer18);

        JobOffer jobOffer19 = new JobOffer();
        jobOffer19.setCompanyId(1L);
        jobOffer19.setDescription("Spokojna praca od zaraz");
        jobOffer19.setField("biurowa");
        jobOffer19.setImg("testImg");
        jobOffer19.setRegion("wielkopolskie");
        jobOffer19.setCity("Poznań");
        jobOffer19.setJobType("usługi");
        jobOffer19.setContractType("umowa o pracę");
        jobOffer19.setTimeType("pełen");
        jobOffer19.setSalary("3000");
        jobOffer19.setAddedDate("15.04.2017");
        jobOffer19.setExpireDate("12.10.2017");
        jobOffer19.setSkills("Obsługiwanie kasy fiskalnej, Dobra komunikacja z ludźmi");
        jobOffer19.setBonuses("Ubezpieczenie");
        jobOffer19.setTitle("Potrzebna bileterka na Dworcu Głównym PKP w Poznaniu");
        jobOfferRepository.save(jobOffer19);

        JobOffer jobOffer20 = new JobOffer();
        jobOffer20.setCompanyId(1L);
        jobOffer20.setDescription("Przyjemna praca na świeżym powietrzu");
        jobOffer20.setField("fizyczna");
        jobOffer20.setImg("testImg");
        jobOffer20.setRegion("mazowieckie");
        jobOffer20.setCity("Warszawa");
        jobOffer20.setJobType("fizyczna");
        jobOffer20.setContractType("umowa o zlecenie");
        jobOffer20.setTimeType("pół etatu");
        jobOffer20.setSalary("1500");
        jobOffer20.setAddedDate("20.04.2017");
        jobOffer20.setExpireDate("1.08.2017");
        jobOffer20.setSkills("Szybka selekcja owoców");
        jobOffer20.setBonuses("-");
        jobOffer20.setTitle("Zatrudnię osobę do zbierania truskawek");
        jobOfferRepository.save(jobOffer20);
    }
    private void initCompany() {
        Employer employer = new Employer();
        employer.setName("Pracodawca1");
        employer.setImg("testEmployer");
        employer.setAbout("opis pracodawcy");
        employer.setCity("Poznan");
        employer.setRegion("Wielkopolska");
        employer.setTelephone("666555333");
        employer.setEmailAddress("testemployer@example.com");
        employer.setWebPage("www.testdsadsadsa.com");
        employer.setOffersId("1,2,3");

        employerRepository.save(employer);
    }
}
