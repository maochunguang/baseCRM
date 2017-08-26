package com.koowo.entity.paycenter;

import com.koowo.exceptions.KoowoHibernateException;
import com.koowo.game.hibernate.bean.GameVipLevel;
import com.koowo.game.hibernate.bean.GameVipUserInfo;
import com.koowo.payCenter.hibernate.services.PayService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 礼包的定义 
 * @author heavenking
 *
 */
public class GiftPack {

	private static Log log= LogFactory.getLog(GiftPack.class);
	/**
	 * 根据一次支付的内容决定给多少抵用券
	 * @param account
	 * @param channel
	 * @param cash
	 * @param now
	 * @return
	 */
	public static GiftPack getGiftPack(Account account, String comments, long cash, Date now, Long giftId){
		GiftPack pack = new GiftPack();
		
		Calendar overTime = Calendar.getInstance(Locale.CHINA);
		
		//抵用券记录中用的时间，为合并同一年获得的抵用券，强行设置时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String getDateStr = sdf.format(now);
		
		//获得抵用券类型记录
		Gift gift = null;
		try {
			gift = PayService.getGiftById(giftId);
		} catch (KoowoHibernateException e) {
			// TODO: handle exception
			gift = null;
		}
		if(gift == null){
			return pack;
		}
		
		//计算给抵用券的金额
		long cnt = 0;
		if(giftId.equals(Gift.GAMEUNION_GIFT))//计算游戏联运抵用券
		{
			long total=account.getGameunionTotal().longValue();
			log.info("now gameunion_total: " + total);
			if(total >= 5000){
				if(cash >= 10){
					cnt = cash * 6 / 5;
				}
			}
			else if(total >= 3000){
				if(cash >= 10){
					cnt = cash * 4 / 5;
				}
			}
			else if(total >= 800){
				if(cash >= 10){
					cnt = cash / 2;
				}
			}
			log.info("get gameunion_gift: " + cnt);
			
//			根据抵用券的类型设置过期时间
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
			
		}else if(giftId.equals(Gift.SMASH_GOLDEN_EGG_GIFT)){//砸蛋领取现金券
			log.info("Smash Golden Egg get gift cash : " + cash);
			//抽中多少加多少
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else if(giftId.equals(Gift.KUWO_CARD_GIFT)){//酷我一卡通现金券
			log.info("KwCard get gift cash : " + cash);
			//传多少加多少
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else if(giftId.equals(Gift.KUWO_POPUP_ONE_GIFT)){//一弹领取现金券
			log.info("popup one get gift cash : " + cash);
			//一弹送现金券
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else if(giftId.equals(Gift.KUWO_GAME_YXSC_GIFT)){
			log.info("game shouchong get gift cash : " + cash);
			//游戏首充专题领取现金券
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else if(giftId.equals(Gift.KUWO_GAME_LIBAO_GIFT)){
			log.info("game giftlibao get gift cash : " + cash);
			//现金券礼包
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else if(giftId.equals(Gift.GAMEBOX_REWARD_GIFT)){
			log.info("gamebox reward get gift cash : " + cash);
			//游戏盒红包现金券
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else if(giftId.equals(Gift.YEAR_END_REBATE_GIFT)){
			log.info("year end rebate get gift cash : " + cash);
			//年末充值返利现金券
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else{
			//以后会有其它类型的抵用券，目前没有先空着
		}
		
		
		//如果有优惠，则给抵用券
		if(cnt > 0){
			pack.giftRec = new GiftRec();
			pack.giftRec.setAccountId(account.getId());
			pack.giftRec.setCash(new Long(cnt));
			pack.giftRec.setCashLeft(new Long(cnt));
			pack.giftRec.setGetTime(now);
			pack.giftRec.setGiftId(giftId);
			pack.giftRec.setOverTime(overTime.getTime());
			pack.giftRec.setState(GiftRec.STATE_NORMAL);
			pack.giftRec.setGetDateStr(getDateStr);
			
			pack.giftGetLog = new GiftGetLog();
			pack.giftGetLog.setAccountId(account.getId());
			pack.giftGetLog.setCash(new Long(cnt));
			pack.giftGetLog.setComments(comments);
			pack.giftGetLog.setEstablishTime(now);
			pack.giftGetLog.setGiftId(giftId);
			pack.giftGetLog.setState(GiftGetLog.STATE_NORMAL);
		}
		
		return pack;
	}
	
	/**
	 * 管理员修改某个账号的抵用券
	 * @param account
	 * @param comments
	 * @param giftCount
	 * @param now
	 * @param giftId
	 * @return
	 */
	public static GiftPack getGiftPackByAdminMod(Account account,long giftCount,Date now,Long giftId)
	{
		GiftPack pack = new GiftPack();
		if(giftCount==0)return pack;
		
		Calendar overTime = Calendar.getInstance(Locale.CHINA);
		
		//抵用券记录中用的时间，为合并同一年获得的抵用券，强行设置时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String getDateStr = sdf.format(now);
		
		//获得抵用券类型记录
		Gift gift = null;
		try {
			gift = PayService.getGiftById(giftId);
		} catch (KoowoHibernateException e) {
			// TODO: handle exception
			gift = null;
		}
		if(gift == null){
			return pack;
		}
		long cnt=giftCount;
		if(giftId.equals(Gift.GAMEUNION_GIFT))
		{
			log.info("get gameunion_gift by admin mod: " + cnt);
			
//			根据抵用券的类型设置过期时间
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
			
		}else{
			//留给以后添加别的抵用券再来写
		}
		String comments="管理员";
		if(cnt>0){
			comments+="加了"+cnt+"张抵用券";
		}else{
			comments+="减了"+Math.abs(cnt)+"张抵用券";
		}
		
		pack.giftRec = new GiftRec();
		pack.giftRec.setAccountId(account.getId());
		pack.giftRec.setCash(new Long(cnt));
		pack.giftRec.setCashLeft(new Long(cnt));
		pack.giftRec.setGetTime(now);
		pack.giftRec.setGiftId(giftId);
		pack.giftRec.setOverTime(overTime.getTime());
		pack.giftRec.setState(GiftRec.STATE_NORMAL);
		pack.giftRec.setGetDateStr(getDateStr);
		
		pack.giftGetLog = new GiftGetLog();
		pack.giftGetLog.setAccountId(account.getId());
		pack.giftGetLog.setCash(new Long(cnt));
		pack.giftGetLog.setComments(comments);
		pack.giftGetLog.setEstablishTime(now);
		pack.giftGetLog.setGiftId(giftId);
		pack.giftGetLog.setState(GiftGetLog.STATE_NORMAL);
		
		
		return pack;
	}
	
	//成员变量
	public GiftRec giftRec;
	public GiftGetLog giftGetLog;
	
	/**
	 * 构造方法
	 *
	 */
	public GiftPack(){
		giftRec = null;
		giftGetLog = null;
	}
	
	/**
	 * 根据一次支付的内容决定给多少抵用券
	 * @param account
	 * @param channel
	 * @param cash
	 * @param now
	 * @return
	 * 此版为2014 修改返点机制
	 */
	public static GiftPack getGiftPack_2014(Account account, String comments, long cash, Date now, Long giftId,GameVipUserInfo gameVipUserInfo,List<GameVipLevel>  gameVipLevelList){
		GiftPack pack = new GiftPack();
		
		Calendar overTime = Calendar.getInstance(Locale.CHINA);
		
		//抵用券记录中用的时间，为合并同一年获得的抵用券，强行设置时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String getDateStr = sdf.format(now);
		
		//获得抵用券类型记录
		Gift gift = null;
		try {
			gift = PayService.getGiftById(giftId);
		} catch (KoowoHibernateException e) {
			// TODO: handle exception
			gift = null;
		}
		if(gift == null){
			return pack;
		}
		
		//计算给抵用券的金额
		long cnt = 0;
		if(giftId.equals(Gift.GAMEUNION_GIFT))//计算游戏联运抵用券
		{
			long total=account.getGameunionTotal().longValue();
			log.info("now gameunion_total: " + total);
			GameVipLevel gLevel = GameVipLevel.getLevelByMoney(gameVipLevelList, total+cash);
			if(gameVipUserInfo!=null&&gameVipUserInfo.getOldFlag()==1&&gameVipUserInfo.getVipLevel()>gLevel.getVipLevel()){
				//若为老用户,并且老用户等级大于充值总额所对应的等级,则寻找老用户vip的等级所对应的返券比例
				gLevel = GameVipLevel.getGameVipLevelByLevel(gameVipLevelList, gameVipUserInfo.getVipLevel());
			}
			cnt = cash * gLevel.getRatio() / 100;
			//累计充值到800的返240券
			if(total>0&&total<800&&total+cash>=800&&total+cash<1500){
				cnt = (total+cash) * gLevel.getRatio() / 100;
			}
			log.info("get gameunion_gift: " + cnt);
			
//			根据抵用券的类型设置过期时间
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
			
		}else if(giftId.equals(Gift.SMASH_GOLDEN_EGG_GIFT)){//砸蛋领取现金券
			log.info("Smash Golden Egg get gift cash : " + cash);
			//抽中多少加多少
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else if(giftId.equals(Gift.KUWO_CARD_GIFT)){//酷我一卡通现金券
			log.info("KwCard get gift cash : " + cash);
			//传多少加多少
			cnt = cash;
			
			//使用与充值返现相同的有效日期
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}else{
			//以后会有其它类型的抵用券，目前没有先空着
		}
		
		
		//如果有优惠，则给抵用券
		if(cnt > 0){
			pack.giftRec = new GiftRec();
			pack.giftRec.setAccountId(account.getId());
			pack.giftRec.setCash(new Long(cnt));
			pack.giftRec.setCashLeft(new Long(cnt));
			pack.giftRec.setGetTime(now);
			pack.giftRec.setGiftId(giftId);
			pack.giftRec.setOverTime(overTime.getTime());
			pack.giftRec.setState(GiftRec.STATE_NORMAL);
			pack.giftRec.setGetDateStr(getDateStr);
			
			pack.giftGetLog = new GiftGetLog();
			pack.giftGetLog.setAccountId(account.getId());
			pack.giftGetLog.setCash(new Long(cnt));
			pack.giftGetLog.setComments(comments);
			pack.giftGetLog.setEstablishTime(now);
			pack.giftGetLog.setGiftId(giftId);
			pack.giftGetLog.setState(GiftGetLog.STATE_NORMAL);
		}
		
		return pack;
	}
	
	
	/**
	 * 根据一次支付的内容决定给多少兑换券
	 * @param account
	 * @param channel
	 * @param cash
	 * @param now
	 * @return
	 * 
	 */
	public static GiftPack getGiftPack_dh_2014(Account account, String comments, long cash, Date now, Long giftId,GameVipUserInfo gameVipUserInfo,List<GameVipLevel>  gameVipLevelList){
		GiftPack pack = new GiftPack();
		
		Calendar overTime = Calendar.getInstance(Locale.CHINA);
		
		//抵用券记录中用的时间，为合并同一年获得的抵用券，强行设置时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		String getDateStr = sdf.format(now);
		
		//获得抵用券类型记录
		Gift gift = null;
		try {
			gift = PayService.getGiftById(giftId);
		} catch (KoowoHibernateException e) {
			// TODO: handle exception
			gift = null;
		}
		if(gift == null){
			return pack;
		}
		
		//计算给抵用券的金额
		long cnt = 0;
		if(giftId.equals(Gift.KUWO_DUI_GIFT))//计算游戏联运兑换券
		{
			long total=account.getGameunionTotal().longValue();
			log.info("now gameunion_total: " + total);
			GameVipLevel gLevel = GameVipLevel.getLevelByMoney(gameVipLevelList, total+cash);
			if(gameVipUserInfo!=null&&gameVipUserInfo.getOldFlag()==1&&gameVipUserInfo.getVipLevel()>gLevel.getVipLevel()){
				//若为老用户,并且老用户等级大于充值总额所对应的等级,则寻找老用户vip的等级所对应的返券比例
				gLevel = GameVipLevel.getGameVipLevelByLevel(gameVipLevelList, gameVipUserInfo.getVipLevel());
			}
			if(gLevel.getVipLevel()>=4){
				//如果是老用户
				if(gameVipUserInfo!=null&&gameVipUserInfo.getOldFlag()==1){
					cnt = cash * 60 / 100;	
				}else{
				if(total>=5000){
					cnt = cash * 60 / 100;	
				}else {
					if(total+cash-5000>=100){
						cnt = (total+cash-5000) * 60 / 100;	
					}
				}
				}
				
			}
			log.info("get gameunion_dh_gift: " + cnt + " comments : " + comments);
			
//			根据抵用券的类型设置过期时间
			overTime.add(Calendar.YEAR, 100);
			overTime.set(Calendar.MONTH, Calendar.DECEMBER);
			overTime.set(Calendar.DAY_OF_MONTH, 31);
			overTime.set(Calendar.HOUR_OF_DAY, 23);
			overTime.set(Calendar.MINUTE, 59);
			overTime.set(Calendar.SECOND, 59);
			overTime.set(Calendar.MILLISECOND, 0);
		}
		
		
		//如果有优惠，则给抵用券
		if(cnt > 0){
			pack.giftRec = new GiftRec();
			pack.giftRec.setAccountId(account.getId());
			pack.giftRec.setCash(new Long(cnt));
			pack.giftRec.setCashLeft(new Long(cnt));
			pack.giftRec.setGetTime(now);
			pack.giftRec.setGiftId(giftId);
			pack.giftRec.setOverTime(overTime.getTime());
			pack.giftRec.setState(GiftRec.DHQ_STATE_NORMAL);
			pack.giftRec.setGetDateStr(getDateStr);
			
			pack.giftGetLog = new GiftGetLog();
			pack.giftGetLog.setAccountId(account.getId());
			pack.giftGetLog.setCash(new Long(cnt));
			pack.giftGetLog.setComments(comments);
			pack.giftGetLog.setEstablishTime(now);
			pack.giftGetLog.setGiftId(giftId);
			pack.giftGetLog.setState(GiftGetLog.DHQ_STATE_NORMAL);
		}
		
		return pack;
	}
}
