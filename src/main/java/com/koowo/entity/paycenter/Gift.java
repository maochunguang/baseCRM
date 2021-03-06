package com.koowo.entity.paycenter;



/**
 * Gift generated by MyEclipse - Hibernate Tools
 */

public class Gift  implements java.io.Serializable {

	public static Integer STATE_NORMAL = new Integer("0");
	public static Long GAMEUNION_GIFT = new Long(1);//游戏联运现金券类型 
	public static Long SMASH_GOLDEN_EGG_GIFT = new Long(2);//砸蛋抽现金券
	public static Long KUWO_CARD_GIFT = new Long(3);//酷我一卡通现金券
	public static Long KUWO_DUI_GIFT = new Long(4);//游戏联运酷豆类型
	public static Long KUWO_POPUP_ONE_GIFT = new Long(5);//一弹兑换券
	public static Long KUWO_GAME_YXSC_GIFT = new Long(6);//游戏首充专题现金券
	public static Long KUWO_GAME_LIBAO_GIFT = new Long(7);//现金券礼包
	public static Long GAMEBOX_REWARD_GIFT = new Long(8);//游戏盒红包现金券
	public static Long YEAR_END_REBATE_GIFT = new Long(9);//年末充值返利现金券
     // Fields    

     private Long id;
     private String giftName;
     private String giftDesc;
     private Integer validTime;
     private Integer state;


    // Constructors

    /** default constructor */
    public Gift() {
    }

    
    /** full constructor */
    public Gift(String giftName, String giftDesc, Integer validTime, Integer state) {
        this.giftName = giftName;
        this.giftDesc = giftDesc;
        this.validTime = validTime;
        this.state = state;
    }

   
    // Property accessors

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getGiftName() {
        return this.giftName;
    }
    
    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftDesc() {
        return this.giftDesc;
    }
    
    public void setGiftDesc(String giftDesc) {
        this.giftDesc = giftDesc;
    }

    public Integer getValidTime() {
        return this.validTime;
    }
    
    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }

    public Integer getState() {
        return this.state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }
    
}