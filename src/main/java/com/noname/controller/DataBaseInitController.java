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
