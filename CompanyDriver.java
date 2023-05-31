package Onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aneesh");
		EntityManager em =  emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		Employee employee1= new Employee();
		employee1.setId(1);
		employee1.setName("Manish");
		employee1.setAge(24);
		employee1.setSal(40000);


		Employee employee2= new Employee();
		employee2.setId(2);
		employee2.setName("Piyush");
		employee2.setAge(25);
		employee2.setSal(80000);
		
		Company company = new Company();
		company.setCeo("Aneesh");
		company.setId(01);
		company.setHeadquaters("pune");
		
		company.setEmployee(employee1);
		company.setEmployee(employee2);
		
		et.begin();
		em.persist(company);
		em.persist(employee1);
		em.persist(employee2);
		et.commit();
		
	}

}
