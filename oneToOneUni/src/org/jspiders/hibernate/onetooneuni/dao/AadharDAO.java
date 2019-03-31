package org.jspiders.hibernate.onetooneuni.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jspiders.hibernate.onetooneuni.dto.AadharDTO;
import org.jspiders.hibernate.onetooneuni.dto.PersonDTO;

public class AadharDAO {

	public long saveAadhar(AadharDTO aadharDTO, PersonDTO dto) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = null;
		Transaction transaction = null;
		long pk = 0;
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
			pk = (long) session.save(aadharDTO);
			session.save(dto);
			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}

		}

		return pk;
	}

}
