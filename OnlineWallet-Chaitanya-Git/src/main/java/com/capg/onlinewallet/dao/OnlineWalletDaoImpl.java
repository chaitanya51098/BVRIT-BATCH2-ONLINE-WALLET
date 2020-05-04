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
import com.capg.onlinewallet.entities.TransferBean;

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

	/*the updateOnlinewallet method is meant to update the onlinewalletBean
	  attributes*/
	@Override
	public OnlineWallet updateOnlineWallet(OnlineWallet onlinewallet) {
		// TODO Auto-generated method stub
		OnlineWallet onlinewalletbean = findOnlineWalletById(onlinewallet.getCustomerId());
		onlinewalletbean.setCustomerName(onlinewallet.getCustomerName());
		onlinewalletbean.setAccountBalance(onlinewallet.getAccountBalance());
		onlinewalletbean = entityManager.merge(onlinewalletbean);
		return onlinewalletbean;
	}

	/* shows the details of onlinewallet */
	@Override
	public List<OnlineWallet> findAllOnlineWallets() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("select e from OnlineWallet e");
		List<OnlineWallet> list = query.getResultList();
		return list;
	}
	
	/*continues from the service layer and transfers the funds from one id to
	  another id which are existing*/
	 @Override
	public OnlineWallet deposit(TransferBean transferBean) {
		// TODO Auto-generated method stub
		OnlineWallet bean = entityManager.find(OnlineWallet.class, transferBean.getCustomerId1());
		bean.setAccountBalance(bean.getAccountBalance() - transferBean.getAmount());
		System.out.println(bean);
		entityManager.persist(bean);
		OnlineWallet bean1 = entityManager.find(OnlineWallet.class, transferBean.getCustomerId2());
		bean1.setAccountBalance(bean1.getAccountBalance() + transferBean.getAmount());
		System.out.println(bean1);
		entityManager.persist(bean1);

		return bean;
	}
    /* this method addAmount adds the amount an existing account*/
	@Override
	public OnlineWallet addAmount(int customerId, int amount) {
		OnlineWallet bean = entityManager.find(OnlineWallet.class, customerId);
		try {
			bean.setAccountBalance(amount + bean.getAccountBalance());
		} catch (Exception e) {
			return null;
		}
		return entityManager.merge(bean);
	}
}
