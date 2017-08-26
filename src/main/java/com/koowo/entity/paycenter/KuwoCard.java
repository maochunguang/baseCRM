package com.koowo.entity.paycenter;

import com.koowo.payCenter.payadapter.kuwocard.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/**
 * 酷我一卡通
 * @author YANGH-7
 *
 */
public class KuwoCard {
	
	/**
	 * 一卡通使用的状态值
	 */
	public static Short useStatus = new Short("1");
	/**
	 * 一卡通未使用的状态值
	 */
	public static Short notUseStatus = new Short("0");
	
	/**
	 * 一卡通禁用的状态
	 */
	public static Short disableStatus = new Short("9");
	
	/**
	 * 卡的长度
	 */
	public static int length = 18;
	
	/**
	 * 生成卡密的md5私钥
	 */
	public static String md5Key = "yeelion20131206KeyKuwoCard";	
	
	private Long id;
	
	/**
	 * 充值的账户ID
	 */
	private Long accountId;

	/**
	 * 面额
	 */
	private Long cash;
	
	/**
	 * 卡号
	 */
	private String cardNo;
	
	/**
	 * 生成时间
	 */
	private Date genTime;
	
	/**
	 * 使用时间
	 */
	private Date useTime;
	
	/**
	 * 使用状态
	 */
	private Short status;
	
	/**
	 * 使用的游戏
	 */
    private String useGame;
    
    /**
     * 使用的游戏的服务器
     */
    private String useServer;
    
    /**
     * 卡密，不在数据库中保存，只是为了遍历list的时候用
     */
    private String cardPwd;

	/**
     * 批号
     */
    private String version;
    
    /**
     * 生成人的用户名
     */
    private String genUserName;
    /**
     * 消卡人的用户名
     */
    private String disableUserName;
    /**
     * 生成备注
     */
    private String genNote;
    /**
     * 消卡备注
     */
    private String disableNote;
    
    /**
     * 消卡时间
     */
    private Date disableTime;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}	

	public Long getCash() {
		return cash;
	}

	public void setCash(Long cash) {
		this.cash = cash;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Date getGenTime() {
		return genTime;
	}

	public void setGenTime(Date genTime) {
		this.genTime = genTime;
	}

	public Date getUseTime() {
		return useTime;
	}

	public void setUseTime(Date useTime) {
		this.useTime = useTime;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getUseGame() {
		return useGame;
	}

	public void setUseGame(String useGame) {
		this.useGame = useGame;
	}

	public String getUseServer() {
		return useServer;
	}

	public void setUseServer(String useServer) {
		this.useServer = useServer;
	}
	
	public String getCardPwd() {
		return cardPwd;
	}

	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}	
	
    public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getGenUserName() {
		return genUserName;
	}

	public void setGenUserName(String genUserName) {
		this.genUserName = genUserName;
	}

	public String getDisableUserName() {
		return disableUserName;
	}

	public void setDisableUserName(String disableUserName) {
		this.disableUserName = disableUserName;
	}

	public String getGenNote() {
		return genNote;
	}

	public void setGenNote(String genNote) {
		this.genNote = genNote;
	}

	public String getDisableNote() {
		return disableNote;
	}

	public void setDisableNote(String disableNote) {
		this.disableNote = disableNote;
	}	
	
	public Date getDisableTime() {
		return disableTime;
	}

	public void setDisableTime(Date disableTime) {
		this.disableTime = disableTime;
	}	
	
	/**
	 * 生成一卡通的卡号，将源字符串按照该数位(9, 6, 5, 3, 1,
	 *  4, 16, 18, 7, 15,
	 *  13, 2, 10, 8, 11,
	 *  14, 12, 17)拼接成卡号，这里是按照字符串的位数，要使用字符串的index的话，要记得减一
	 * @return 返回一卡通的卡号
	 */
	public static String genCardNo() {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance(Locale.CHINA);
		String srcCardNo = format.format(cal.getTime()) + getRandomString(4);
//		System.out.println("srcCardNo:" + srcCardNo + ", srcCardNo.length:" + srcCardNo.length());
		return getCardNo(srcCardNo);
	}	
	
	/**
	 * 将源字符串转换为卡号，将源字符串按照该数位(9, 6, 5, 3, 1,
	 *  4, 16, 18, 7, 15,
	 *  13, 2, 10, 8, 11,
	 *  14, 12, 17)拼接成卡号，这里是按照字符串的位数，要使用字符串的index的话，要记得减一 
	 * @param srcCardNo 源字符串
	 * @return
	 */
	public static String getCardNo(String srcCardNo) {
		StringBuffer buf = new StringBuffer();
		buf.append(srcCardNo.charAt(9 - 1)).append(srcCardNo.charAt(6 - 1)).append(srcCardNo.charAt(5 - 1)).append(srcCardNo.charAt(3 - 1)).append(srcCardNo.charAt(1 - 1))
		.append(srcCardNo.charAt(4 - 1)).append(srcCardNo.charAt(16 - 1)).append(srcCardNo.charAt(18 - 1)).append(srcCardNo.charAt(7 - 1)).append(srcCardNo.charAt(15 - 1))
		.append(srcCardNo.charAt(13 - 1)).append(srcCardNo.charAt(2 - 1)).append(srcCardNo.charAt(10 - 1)).append(srcCardNo.charAt(8 - 1)).append(srcCardNo.charAt(11 - 1))
		.append(srcCardNo.charAt(14 - 1)).append(srcCardNo.charAt(12 - 1)).append(srcCardNo.charAt(17 - 1));
		String cardNo = buf.toString();
		if (cardNo.length() != length) {
		}	
		return cardNo;
	}
	
	/**
	 * 将一卡通卡号逆向转回源字符串，用于计算密码。
	 * @param cardNo 一卡通卡号，将卡号按照该数位（5, 12, 4, 6, 3,
	 *  2, 9, 14, 1, 13,
	 *  15, 17, 11, 16, 10,
	 *  7, 18, 8）拼接回来源字符串，这里是按照字符串的位数，要使用字符串的index的话，要记得减一
	 * @return
	 */
	public static String getSrcCardNo(String cardNo) {
		StringBuffer buf = new StringBuffer();
		buf.append(cardNo.charAt(5 - 1)).append(cardNo.charAt(12 - 1)).append(cardNo.charAt(4 - 1)).append(cardNo.charAt(6 - 1)).append(cardNo.charAt(3 - 1))
		.append(cardNo.charAt(2 - 1)).append(cardNo.charAt(9 - 1)).append(cardNo.charAt(14 - 1)).append(cardNo.charAt(1 - 1)).append(cardNo.charAt(13 - 1))
		.append(cardNo.charAt(15 - 1)).append(cardNo.charAt(17 - 1)).append(cardNo.charAt(11 - 1)).append(cardNo.charAt(16 - 1)).append(cardNo.charAt(10 - 1))
		.append(cardNo.charAt(7 - 1)).append(cardNo.charAt(18 - 1)).append(cardNo.charAt(8 - 1));
		String srcCardNo = buf.toString();
		if (srcCardNo.length() != length) {
			
		}
		return srcCardNo;
	}
	
	/**
	 * 获取该一卡通的密码
	 * @param srcCardNo 卡号的源字符串
	 * @return
	 */
	public static String getCardPwd(String srcCardNo) { 
		String preSign = srcCardNo + md5Key;
		String sign  = new MD5Util().getMD5ofStr(preSign, "UTF-8");
		return sign;
	}
	
	/**
	 * 获取随机数字
	 * @param length 随机数字的长度
	 * @return
	 */
	public static String getRandomString(int length) {
		String str = "0123456789";
		StringBuffer buf = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			String rand = str.charAt(random.nextInt(str.length())) + "";
			buf.append(rand);
		}
		return buf.toString();
	}	
	
	public static void main(String[] args) {
		String cardNo = genCardNo();
		System.out.println("cardNo:" + cardNo);
		String srcCardNo = getSrcCardNo(cardNo);
		System.out.println("srcCardNo:" + srcCardNo);
		String cardPwd = getCardPwd(srcCardNo);
		System.out.println("cardPwd:" + cardPwd);
	}
}
