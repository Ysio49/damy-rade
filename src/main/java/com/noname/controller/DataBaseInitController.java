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
        jobOffer.setField("id");
        jobOffer.setImg("testImg");
        jobOffer.setRegion("kujawsko-pomorskie");
        jobOffer.setCity("Bydgoszcz");
        jobOffer.setJobType("Biurowa");
        jobOffer.setContractType("umowa o prace");
        jobOffer.setTimeType("pełen etat");
        jobOffer.setSalary("3000");
        jobOffer.setAddedDate("25.05.2017");
        jobOffer.setExpireDate("1.06.2017");
        jobOffer.setSkills("Office, Komputery");
        jobOffer.setBonuses("Ubezpieczenie, Prywatna opieka medyczna");
        jobOffer.setTitle("Praca biurowa od zaraz");

        jobOfferRepository.save(jobOffer);

        JobOffer jobOffer2 = new JobOffer();
        jobOffer2.setCompanyId(1L);
        jobOffer2.setDescription("Dobre warunki pracy, przyjdź do nas jesteśmy fajni");
        jobOffer2.setField("IT");
        jobOffer2.setImg("test");
        jobOffer2.setRegion("Mazowieckie");
        jobOffer2.setCity("Warszawa");
        jobOffer2.setJobType("Praca o charakterze mieszanym");
        jobOffer2.setContractType("umowa o dzieło");
        jobOffer2.setTimeType("pełen etat");
        jobOffer2.setSalary("1000");
        jobOffer2.setAddedDate("15.05.2017");
        jobOffer2.setExpireDate("24.07.2017");
        jobOffer2.setSkills("Skill1, Skill2, Skill3");
        jobOffer2.setBonuses(null);
        jobOffer2.setTitle("chodź do nas wyciśniemy z Ciebie wszystko co się da");

        jobOfferRepository.save(jobOffer2);

        JobOffer jobOffer3 = new JobOffer();
        jobOffer3.setCompanyId(1L);
        jobOffer3.setDescription("Siema siema wciskamy ludziom kit, zapraszamy na rozmowę");
        jobOffer3.setField("Ubezpieczenia");
        jobOffer3.setImg("test");
        jobOffer3.setRegion("Wielkopolskie");
        jobOffer3.setCity("Poznan");
        jobOffer3.setJobType("Praca zdalna");
        jobOffer3.setContractType("umowa o wolontariar");
        jobOffer3.setTimeType("pełen etat");
        jobOffer3.setSalary("99999");
        jobOffer3.setAddedDate("14.05.2017");
        jobOffer3.setExpireDate("24.12.2017");
        jobOffer3.setSkills("Skill1, Skill2, Skill3, Skill4");
        jobOffer3.setBonuses(null);
        jobOffer3.setTitle("Oferta pracy, zapraszamy!");

        jobOfferRepository.save(jobOffer3);

        JobOffer jobOffer4 = new JobOffer();
        jobOffer4.setCompanyId(1L);
        jobOffer4.setDescription("Profesjonalna rześnia świń i bawołów.");
        jobOffer4.setField("Morderstwa zwierząt");
        jobOffer4.setImg("test");
        jobOffer4.setRegion("Mazowieckie");
        jobOffer4.setCity("Warszawa");
        jobOffer4.setJobType("Praca fizyczna");
        jobOffer4.setContractType("umowa śmieciowa");
        jobOffer4.setTimeType("pół etatu");
        jobOffer4.setSalary("1200");
        jobOffer4.setAddedDate("15.06.2017");
        jobOffer4.setExpireDate("25.11.2017");
        jobOffer4.setSkills("Skill1, Odporność psychiczna, Skill3, Skill4");
        jobOffer4.setBonuses(null);
        jobOffer4.setTitle("Miła atmosfera w rzeźni");

        jobOfferRepository.save(jobOffer4);

        JobOffer jobOffer5 = new JobOffer();
        jobOffer5.setCompanyId(1L);
        jobOffer5.setDescription("Gamedev z PYRA.NET");
        jobOffer5.setField("IT");
        jobOffer5.setImg("test");
        jobOffer5.setRegion("Wielkopolskie");
        jobOffer5.setCity("Poznan");
        jobOffer5.setJobType("Praca biurowa");
        jobOffer5.setContractType("Praca fizyczna");
        jobOffer5.setTimeType("pełen etat");
        jobOffer5.setSalary("300");
        jobOffer5.setAddedDate("8.01.2017");
        jobOffer5.setExpireDate("28.4.2018");
        jobOffer5.setSkills("Skill1, Skill2, Skill5, Skill5");
        jobOffer5.setBonuses(null);
        jobOffer5.setTitle("PYRA.NET");

        jobOfferRepository.save(jobOffer5);

        JobOffer jobOffer6 = new JobOffer();
        jobOffer6.setCompanyId(1L);
        jobOffer6.setDescription("Pomoc przy organizacji hackatonu");
        jobOffer6.setField("IT");
        jobOffer6.setImg("test");
        jobOffer6.setRegion("Małopolska");
        jobOffer6.setCity("Kraków");
        jobOffer6.setJobType("Inne");
        jobOffer6.setContractType("na zlecenie");
        jobOffer6.setTimeType("-");
        jobOffer6.setSalary("1801");
        jobOffer6.setAddedDate("3.2.2016");
        jobOffer6.setExpireDate("20.10.2019");
        jobOffer6.setSkills("Skill1, Skill2, Skill6, Skill4");
        jobOffer6.setBonuses(null);
        jobOffer6.setTitle("Hackaton!");

        jobOfferRepository.save(jobOffer6);

        JobOffer jobOffer7 = new JobOffer();
        jobOffer7.setCompanyId(1L);
        jobOffer7.setDescription("Prywatny ochroniarz 24h");
        jobOffer7.setField("Ochrona");
        jobOffer7.setImg("test");
        jobOffer7.setRegion("Zachodnio-pomorskie");
        jobOffer7.setCity("Szczecin");
        jobOffer7.setJobType("Praca fizyczna");
        jobOffer7.setContractType("umowa");
        jobOffer7.setTimeType("pełen etat");
        jobOffer7.setSalary("300");
        jobOffer7.setAddedDate("1.01.2010");
        jobOffer7.setExpireDate("29.3.2025");
        jobOffer7.setSkills("Skill1, Skill2, Skill7, Skill4");
        jobOffer7.setBonuses(null);
        jobOffer7.setTitle("Ochroniarz");

        jobOfferRepository.save(jobOffer7);

        JobOffer jobOffer8 = new JobOffer();
        jobOffer8.setCompanyId(1L);
        jobOffer8.setDescription("Ubezpieczyciel dla surykatek");
        jobOffer8.setField("Ubezpieczenia");
        jobOffer8.setJobType("Praca biurowa");
        jobOffer8.setContractType("umowa o wolontariat");
        jobOffer8.setTimeType("pełen etat");
        jobOffer8.setSalary("5001");
        jobOffer8.setAddedDate("9.06.2015");
        jobOffer8.setExpireDate("25.11.2018");
        jobOffer8.setSkills("Skill1, Skill2, Skill8, Skill4");
        jobOffer8.setBonuses(null);
        jobOffer8.setTitle("Bezpiecznie surykatki");

        jobOfferRepository.save(jobOffer8);

        JobOffer jobOffer9 = new JobOffer();
        jobOffer9.setCompanyId(1L);
        jobOffer9.setDescription("Jeżdzenie tirem w losowe miejsca");
        jobOffer9.setField("Transport");
        jobOffer9.setCity("Poznan");
        jobOffer9.setJobType("Praca fizyczna");
        jobOffer9.setContractType("umowa o wolontariar");
        jobOffer9.setTimeType("pół etatu");
        jobOffer9.setSalary("12000");
        jobOffer9.setAddedDate("14.05.2017");
        jobOffer9.setExpireDate("24.12.2017");
        jobOffer9.setSkills("Skill1, Skill2, Skill9, Skill4");
        jobOffer9.setBonuses(null);
        jobOffer9.setTitle("Kierowca tira");

        jobOfferRepository.save(jobOffer9);

        JobOffer jobOffer10 = new JobOffer();
        jobOffer10.setCompanyId(1L);
        jobOffer10.setDescription("Pilot F17");
        jobOffer10.setField("Transport");
        jobOffer10.setImg("test");
        jobOffer10.setRegion("Mazowieckie");
        jobOffer10.setCity("Warszawa");
        jobOffer10.setJobType("Praca fizyczna");
        jobOffer10.setContractType("umowa o pracę");
        jobOffer10.setTimeType("pół etatu");
        jobOffer10.setSalary("130000");
        jobOffer10.setAddedDate("17.07.2014");
        jobOffer10.setExpireDate("40.11.2025");
        jobOffer10.setSkills("Skill1, Skill2, Skill10, Skill4");
        jobOffer10.setBonuses(null);
        jobOffer10.setTitle("Szukany pilot");

        jobOfferRepository.save(jobOffer10);

        JobOffer jobOffer11 = new JobOffer();
        jobOffer11.setCompanyId(1L);
        jobOffer11.setDescription("Aktor grający bezdomnego dla serialu \"Bezdomny szuka bezdomnej\"");
        jobOffer11.setField("Ubezpieczenia");
        jobOffer11.setImg("test");
        jobOffer11.setRegion("Wielkopolskie");
        jobOffer11.setCity("Poznan");
        jobOffer11.setJobType("Praca zdalna");
        jobOffer11.setContractType("umowa o wolontariar");
        jobOffer11.setTimeType("pełen etat");
        jobOffer11.setSalary("99999");
        jobOffer11.setAddedDate("14.05.2017");
        jobOffer11.setExpireDate("24.12.2017");
        jobOffer11.setSkills("Skill1, Skill2, Skill11, Skill4");
        jobOffer11.setBonuses(null);
        jobOffer11.setTitle("Oferta pracy, zapraszamy!");

        jobOfferRepository.save(jobOffer11);
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
