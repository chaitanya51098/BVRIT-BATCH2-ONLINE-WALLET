package com.capg.onlinewallet.service;
import static org.assertj.core.api.Assertions.assertThat;
//import org.springframework.context.support.StaticApplicationContext; 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlinewallet.dao.IOnlineWalletDao;
import com.capg.onlinewallet.entities.OnlineWallet;
import com.capg.onlinewallet.entities.TransferBean;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransferFundsTest {
	@Autowired
	 private IOnlineWalletService service;
	@MockBean
	private IOnlineWalletDao dao;
	@Test
	public void fundtransfertest()
	{
		OnlineWallet bean = new OnlineWallet();
		TransferBean tansferbean=new TransferBean(); 
	     //  bean.setCustomerId(87);
		tansferbean.setCustomerId1(82);
		tansferbean.setCustomerId2(83);
		tansferbean.setAmount(100);

		Mockito.when(dao.deposit(tansferbean)).thenReturn(bean);
         assertThat(service.deposit(tansferbean)).isEqualTo(bean);
		
	}
}


