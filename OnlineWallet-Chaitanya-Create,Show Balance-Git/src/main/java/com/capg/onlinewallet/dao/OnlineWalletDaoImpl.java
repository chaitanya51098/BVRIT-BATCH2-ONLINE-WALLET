package com.capg.onlinewallet.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

//import com.capg.bank.entity.History;
//import com.capg.bank.entity.BankBean;
//import com.capg.bank.entity.History;
import com.capg.onlinewallet.entities.OnlineWallet;

@Repository
@Transactional
public class OnlineWalletDaoImpl implements IOnlineWalletDao {

	@PersistenceContext
	private EntityManager entityManager;

	/* the CreateOnlineWallet takes the onlinewalletbean */
	@Override
	public OnlineWallet CreateOnlineWallet(OnlineWallet onlinewalletbean) {
		// TODO Auto-generated method stub
		return entityManager.merge(onlinewalletbean);
	}

	/* shows the details of by particular id */
	@Override
	public OnlineWallet findOnlineWalletById(int customerId) {
		// TODO Auto-generated method stub
		return entityManager.find(OnlineWallet.class, customerId);
	}

	
}
