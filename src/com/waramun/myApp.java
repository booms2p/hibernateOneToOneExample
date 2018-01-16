package com.waramun;

import org.hibernate.Session;

import com.waramun.EplClub;
import com.waramun.StadiumDetail;
import com.waramun.HibernateUtil;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate one to one begin");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		EplClub eplClub = new EplClub();
		eplClub.setClubId(4);
		eplClub.setClubName("Manchester City");
		eplClub.setLatestEplChamp(2016);
//		eplClub.setStadiumId(5);
//		eplClub.setStadiumId(6);
		
		StadiumDetail stadium = new StadiumDetail();
//		stadium.setStadiumId(5);
		stadium.setStadiumName("Etihad Stadium");
		stadium.setCapacity(55097);
		
		eplClub.setStadiumDetail(stadium);
		stadium.setEplClub(eplClub);
		
		session.save(eplClub);
		session.getTransaction().commit();
		
		System.out.println("Add Data Done");
	}
	

}
