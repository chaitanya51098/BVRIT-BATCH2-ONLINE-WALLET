package com.capg.onlinewallet.dao;
import java.util.List;

import com.capg.onlinewallet.entities.OnlineWallet;

public interface IOnlineWalletDao {
	
	
	
 public OnlineWallet CreateOnlineWallet(OnlineWallet onlinewalletbean);
    
 public OnlineWallet findOnlineWalletById(int customerId);
	

}
