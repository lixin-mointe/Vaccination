package cn.mointe.vaccination.tools;

/**
 * 常量类 
 *
 */
public class Constants {

	public Constants() {

	}
	
	public static final String TAG = "MainActivity";
	
	public static final String REMIND_SERVICE = "cn.mointe.vaccination.service.VaccinationRemindService";

	// 疫苗名称
	public static final String[] VACCINE_NAME = {
		"乙肝疫苗","卡介苗","乙肝疫苗","脊灰疫苗","Hib结合疫苗",
		"脊灰灭活疫苗","五联疫苗","轮状病毒活疫苗","百白破疫苗","脊灰疫苗",
		"五联疫苗","7价肺炎结合疫苗","Hib结合疫苗","脊灰灭活疫苗","百白破疫苗",
		"脊灰疫苗","7价肺炎结合疫苗","五联疫苗","Hib结合疫苗","脊灰灭活疫苗",
		"百白破疫苗","7价肺炎结合疫苗","A群流脑疫苗","乙肝疫苗","流感疫苗",
		"流感疫苗","麻疹疫苗","A群流脑疫苗","乙脑减毒疫苗","7价肺炎结合疫苗",
		"轮状病毒活疫苗","百白破疫苗","麻风腮疫苗","甲肝灭活疫苗","Hib结合疫苗",
		"五联疫苗","脊灰灭活疫苗","水痘疫苗","乙脑减毒疫苗","甲肝灭活疫苗",
		"23价肺炎疫苗","轮状病毒活疫苗","A+C群流脑疫苗","脊灰疫苗","水痘疫苗",
		"白破疫苗","麻风腮疫苗","乙脑减毒疫苗"};
	// 月龄
	public static final String[] MOON_AGE = {
		"出生24小时内","出生24小时内","1月龄","2月龄","2月龄",
		"2月龄","2月龄","2月龄","3月龄","3月龄",
		"3月龄","3月龄","3月龄","3月龄","4月龄",
		"4月龄","4月龄","4月龄","4月龄","4月龄",
		"5月龄","5月龄","6月龄","6月龄","6月龄",
		"7月龄","8月龄","9月龄","1周岁","1周岁",
		"14月龄","1岁半","1岁半","1岁半","1岁半",
		"1岁半","1岁半","1岁半","2周岁","2周岁",
		"2周岁","2周岁","3周岁","4周岁","4周岁",
		"6周岁","6周岁","6周岁"};
	// 疫苗类型(必打/推荐/可选)
	public static final String[] VACCINE_TYPE = {
		"必打","必打","必打","必打","推荐",
		"推荐","推荐","可选","必打","必打",
		"推荐","推荐","推荐","推荐","必打",
		"必打","推荐","推荐","推荐","推荐",
		"必打","推荐","必打","必打","可选",
		"可选","必打","必打","必打","推荐",
		"可选","必打","必打","必打","推荐",
		"推荐","推荐","可选","必打","必打",
		"推荐","推荐","必打","必打","可选",
		"必打","必打","必打"};
	// 收费/免费
	public static final String[] CHARGE_STANDARD = {
		"免费","免费","免费","免费","收费",
		"收费","收费","收费","免费","免费",
		"收费","收费","收费","收费","免费",
		"免费","收费","收费","收费","收费",
		"免费","收费","免费","免费","收费",
		"收费","免费","免费","免费","收费",
		"收费","免费","免费","免费","收费",
		"收费","收费","收费","免费","免费",
		"收费","收费","免费","免费","收费",
		"免费","免费","免费"};
	// 第1/3剂
	public static final String[] VACCINATION_NUMBER = {
		"第1/3剂","共1剂","第2/3剂","第1/4剂","第1/4剂",
		"第1/4剂","第1/4剂","第1/3剂","第1/4剂","第2/4剂",
		"第2/4剂","第1/4剂","第2/4剂","第2/4剂","第2/4剂",
		"第3/4剂","第2/4剂","第3/4剂","第3/4剂","第3/4剂",
		"第3/4剂","第3/4剂","第1/2剂","第3/3剂","第1/2剂",
		"第2/2剂","共1剂","第2/2剂","第1/3剂","第4/4剂",
		"第2/3剂","第4/4剂","第1/2剂","第1/2剂","第4/4剂",
		"第4/4剂","第4/4剂","第1/2剂","第2/3剂","第2/2剂",
		"共1剂","第3/3剂","共1剂","第4/4剂","第2/2剂",
		"共1剂","第2/2剂","第3/3剂"};
	
	public static final String[] MAIN_MOON_AGE = {
		"出生24小时内","1月龄","2月龄","3月龄","4月龄",
		"5月龄","6月龄","7月龄","8月龄","9月龄","1周岁",
		"14月龄","1岁半","2周岁","3周岁","4周岁","6周岁"};

}
