package com.sisi.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	private static SessionFactory sf;
	static {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sf;
	}

	// 获得开启着的Session
	public static Session getSession() {
		return sf.openSession();
	}

	// 关闭Session
	public static void closeSession(Session session) {
		if (session != null) {
			if (session.isOpen()) {
				session.close();
			}
		}
	}
}
