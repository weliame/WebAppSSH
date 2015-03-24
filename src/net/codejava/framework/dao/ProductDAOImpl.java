/** 
 * Copyright CodeJava.net To Present
 * All rights reserved. 
 */
package net.codejava.framework.dao;

import java.util.List;

import javax.transaction.Transactional;

import net.codejava.framework.model.Product;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;

public class ProductDAOImpl implements ProductDAO {
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> list() {
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>)
			sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
				.list();
		return listProduct;
	}

}
