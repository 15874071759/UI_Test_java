package Pages.organizationpages;

import org.openqa.selenium.WebDriver;

import Common.Locator;
import Common.basepage;

public class organizationpage_user extends basepage{

	public organizationpage_user(WebDriver driver) {
		super(driver);
	}
	
	public String gettitle(){
		return title();
	}
	Locator realname1=getLocator("realname1");
    Locator contain1=getLocator("contain1");
    Locator input1=getLocator("input1");
    Locator and1=getLocator("and1");
    Locator mail1=getLocator("mail1");
    Locator contain2=getLocator("contain2");
    Locator input2=getLocator("input2");
    Locator and2=getLocator("and2");
    Locator owndepartment1=getLocator("owndepartment1");
    Locator belongto1=getLocator("belongto1");
    Locator search1=getLocator("search1");
    Locator and3=getLocator("and3");
    Locator username1=getLocator("username1");
    Locator contain3=getLocator("contain3");
    Locator input3=getLocator("input3");
    Locator and4=getLocator("and4");
    Locator position1=getLocator("position1");
    Locator equal1=getLocator("equal1");
    Locator search2=getLocator("search2");
    Locator and6=getLocator("and6");
    Locator phone1=getLocator("phone1");
    Locator contain4=getLocator("contain4");
    Locator input4=getLocator("input4");
    Locator searchLink=getLocator("searchLink");
    Locator resetLink=getLocator("resetLink");
    Locator save=getLocator("save");
    Locator searchmore=getLocator("searchmore");
    Locator borderbutton=getLocator("borderbutton");
    Locator renewdepartment=getLocator("renewdepartment");
    Locator selectLink=getLocator("selectLink");
    Locator editLink=getLocator("editLink");
    Locator realname2=getLocator("realname2");
    Locator mail2=getLocator("mail2");
    Locator owndepartment2=getLocator("owndepartment2");
    Locator username2=getLocator("username2");
    Locator position2=getLocator("position2");
    Locator phone2=getLocator("phone2");
    Locator workdate1=getLocator("workdate1");
    Locator userid1=getLocator("userid1");
    Locator account1=getLocator("account1");
    Locator sex1=getLocator("sex1");
    Locator qq1=getLocator("qq1");
    Locator skype1=getLocator("skype1");
    Locator yahoo1=getLocator("yahoo1");
    Locator gtalk1=getLocator("gtalk1");
    Locator ali1=getLocator("ali1");
    Locator address1=getLocator("address1");
    Locator mailid1=getLocator("mailid1");
    Locator equal2=getLocator("equal1");
    Locator unequal1=getLocator("unequal1");
    Locator greater1=getLocator("greater1");
    Locator ge1=getLocator("ge1");
	Locator lessthan1 = getLocator("lessthan1");
	Locator le1 = getLocator("le1");
	Locator contain5 = getLocator("contain5");
	Locator between1 = getLocator("between1");
	Locator uncontain1 = getLocator("uncontain1");
	Locator belongto2 = getLocator("belongto2");
	Locator and7 = getLocator("and7");
	Locator or1 = getLocator("or1");
	Locator realname3=getLocator("realname3");
    Locator mail3=getLocator("mail3");
    Locator owndepartment3=getLocator("owndepartment3");
    Locator username3=getLocator("username3");
    Locator position3=getLocator("position3");
    Locator phone3=getLocator("phone3");
    Locator workdate2=getLocator("workdate2");
    Locator userid2=getLocator("userid2");
    Locator account2=getLocator("account2");
    Locator sex2=getLocator("sex2");
    Locator qq2=getLocator("qq2");
    Locator skype2=getLocator("skype2");
    Locator yahoo2=getLocator("yahoo2");
    Locator gtalk2=getLocator("gtalk2");
    Locator ali2=getLocator("ali2");
    Locator address2=getLocator("address2");
    Locator mailid2=getLocator("mailid2");
    Locator equal3=getLocator("equal2");
    Locator unequal2=getLocator("unequal2");
    Locator greater2=getLocator("greater2");
    Locator ge2=getLocator("ge2");
	Locator lessthan2 = getLocator("lessthan2");
	Locator le2 = getLocator("le2");
	Locator contain6 = getLocator("contain6");
	Locator between2 = getLocator("between2");
	Locator uncontain2 = getLocator("uncontain2");
	Locator belongto3 = getLocator("belongto3");
	Locator and8 = getLocator("and8");
	Locator or2 = getLocator("or2");
	Locator realname4=getLocator("realname4");
    Locator mail4=getLocator("mail4");
    Locator owndepartment4=getLocator("owndepartment4");
    Locator username4=getLocator("username4");
    Locator position4=getLocator("position4");
    Locator phone4=getLocator("phone4");
    Locator workdate3=getLocator("workdate3");
    Locator userid3=getLocator("userid3");
    Locator account3=getLocator("account3");
    Locator sex3=getLocator("sex3");
    Locator qq3=getLocator("qq3");
    Locator skype3=getLocator("skype3");
    Locator yahoo3=getLocator("yahoo3");
    Locator gtalk3=getLocator("gtalk3");
    Locator ali3=getLocator("ali3");
    Locator address3=getLocator("address3");
    Locator mailid3=getLocator("mailid3");
    Locator equal4=getLocator("equal3");
    Locator unequal3=getLocator("unequal3");
    Locator greater3=getLocator("greater3");
    Locator ge3=getLocator("ge3");
	Locator lessthan3 = getLocator("lessthan3");
	Locator le3 = getLocator("le3");
	Locator contain7 = getLocator("contain7");
	Locator between3 = getLocator("between3");
	Locator uncontain3 = getLocator("uncontain3");
	Locator belongto4 = getLocator("belongto4");
	Locator and9 = getLocator("and9");
	Locator or3 = getLocator("or3");
	Locator realname5=getLocator("realname5");
    Locator mail5=getLocator("mail5");
    Locator owndepartment5=getLocator("owndepartment5");
    Locator username5=getLocator("username5");
    Locator position5=getLocator("position5");
    Locator phone5=getLocator("phone5");
    Locator workdate4=getLocator("workdate4");
    Locator userid4=getLocator("userid4");
    Locator account4=getLocator("account4");
    Locator sex4=getLocator("sex4");
    Locator qq4=getLocator("qq4");
    Locator skype4=getLocator("skype4");
    Locator yahoo4=getLocator("yahoo4");
    Locator gtalk4=getLocator("gtalk4");
    Locator ali4=getLocator("ali4");
    Locator address4=getLocator("address4");
    Locator mailid4=getLocator("mailid4");
    Locator equal5=getLocator("equal4");
    Locator unequal4=getLocator("unequal4");
    Locator greater4=getLocator("greater4");
    Locator ge4=getLocator("ge4");
	Locator lessthan4 = getLocator("lessthan4");
	Locator le4 = getLocator("le4");
	Locator contain8 = getLocator("contain8");
	Locator between4 = getLocator("between4");
	Locator uncontain4 = getLocator("uncontain4");
	Locator belongto5 = getLocator("belongto5");
	Locator and10 = getLocator("and10");
	Locator or4 = getLocator("or4");
	Locator realname6=getLocator("realname6");
    Locator mail6=getLocator("mail6");
    Locator owndepartment6=getLocator("owndepartment6");
    Locator username6=getLocator("username6");
    Locator position6=getLocator("position6");
    Locator phone6=getLocator("phone6");
    Locator workdate5=getLocator("workdate5");
    Locator userid5=getLocator("userid5");
    Locator account5=getLocator("account5");
    Locator sex5=getLocator("sex5");
    Locator qq5=getLocator("qq5");
    Locator skype5=getLocator("skype5");
    Locator yahoo5=getLocator("yahoo5");
    Locator gtalk5=getLocator("gtalk5");
    Locator ali5=getLocator("ali5");
    Locator address5=getLocator("address5");
    Locator mailid5=getLocator("mailid5");
    Locator equal6=getLocator("equal5");
    Locator unequal5=getLocator("unequal5");
    Locator greater5=getLocator("greater5");
    Locator ge5=getLocator("ge5");
	Locator lessthan5 = getLocator("lessthan5");
	Locator le5 = getLocator("le5");
	Locator contain9 = getLocator("contain9");
	Locator between5 = getLocator("between5");
	Locator uncontain5 = getLocator("uncontain5");
	Locator belongto6 = getLocator("belongto6");
	Locator and11 = getLocator("and11");
	Locator or5 = getLocator("or5");
	Locator realname7=getLocator("realname7");
    Locator mail7=getLocator("mail7");
    Locator owndepartment7=getLocator("owndepartment7");
	Locator username7 = getLocator("username7");
	Locator position7 = getLocator("position7");
	Locator phone7 = getLocator("phone7");
	Locator workdate6 = getLocator("workdate6");
	Locator userid6 = getLocator("userid6");
	Locator account6 = getLocator("account6");
	Locator sex6 = getLocator("sex6");
	Locator qq6 = getLocator("qq6");
	Locator skype6 = getLocator("skype6");
	Locator yahoo6 = getLocator("yahoo6");
	Locator gtalk6 = getLocator("gtalk6");
	Locator ali6 = getLocator("ali6");
	Locator address6 = getLocator("address6");
	Locator mailid6 = getLocator("mailid6");
	Locator equal7 = getLocator("equal6");
	Locator unequal6 = getLocator("unequal6");
	Locator greater6 = getLocator("greater6");
	Locator ge6 = getLocator("ge6");
	Locator lessthan6 = getLocator("lessthan6");
	Locator le6 = getLocator("le6");
	Locator contain10 = getLocator("contain10");
	Locator between6 = getLocator("between6");
	Locator uncontain6 = getLocator("uncontain6");
	Locator belongto7 = getLocator("belongto7");
	Locator id = getLocator("id");
	Locator realname8 = getLocator("realname8");
	Locator username8 = getLocator("username8");
	Locator position8 = getLocator("position8");
	Locator mail8 = getLocator("mail8");
	Locator sex7 = getLocator("sex7");
	Locator phone8 = getLocator("phone8");
	Locator qq7 = getLocator("qq7");
	Locator workdate7 = getLocator("workdate7");
	Locator lastloginLink = getLocator("lastloginLink");
	Locator visitLink = getLocator("visitLink");
	
	public void clickrealname1()
    {
    	click(realname1);
    }
    
    public void clickcontain1()
    {
    	click(contain1);
    }
    
    public void typeinput1(String connect)
    {
    	type(input1,connect);
    }
    
    public void clickand1()
    {
    	click(and1);
    }
    
    public void clickmail1()
    {
    	click(mail1);
    }
    
    public void clickcontain2()
    {
    	click(contain2);
    }
    
    public void typeinput2(String connect)
    {
    	type(input2,connect);
    }
    
    public void clickand2()
    {
    	click(and2);
    }
    
    public void clickowndepartment1()
    {
    	click(owndepartment1);
    }
    
    public void clickbelongto1()
    {
    	click(belongto1);
    }
    
    public void clicksearch1()
    {
    	click(search1);
    }
    
    public void clickand3()
    {
    	click(and3);
    }
    
    public void clickusername1()
    {
    	click(username1);
    }
    
    public void clickcontain3()
    {
    	click(contain3);
    }
    
    public void typeinput3(String connect)
    {
    	type(input3,connect);
    }
    
    public void clickand4()
    {
    	click(and4);
    }
    
    public void clickposition1()
    {
    	click(position1);
    }
    
    public void clickequal1()
    {
    	click(equal1);
    }
    
    public void clicksearch2()
    {
    	click(search2);
    }
    
    public void clickand6()
    {
    	click(and6);
    }
    
    public void clickphone1()
    {
    	click(phone1);
    }
    
    public void clickcontain4()
    {
    	click(contain4);
    }
    
    public void typeinput4(String connect)
    {
    	type(input4,connect);
    }
    
    public void clicksearchLink()
    {
    	click(searchLink);
    }
    
    public void clickresetLink()
    {
    	click(resetLink);
    }
    
    public void clicksave()
    {
    	click(save);
    }
    
    public void clicksearchmore()
    {
    	click(searchmore);
    }
    
    public void clickborderbutton()
    {
    	click(borderbutton);
    }
    
    public void clickrenewdepartment()
    {
    	click(renewdepartment);
    }
    
    public void clickselectLink()
    {
    	click(selectLink);
    }
    
    public void clickeditLink()
    {
    	click(editLink);
    }
    
    public void clickrealname2()
    {
    	click(realname2);
    }
    
    public void clickmail2()
    {
    	click(mail2);
    }
    
    public void clickowndepartment2()
    {
    	click(owndepartment2);
    }
    
    public void clickusername2()
    {
    	click(username2);
    }
    
    public void clickposition2()
    {
    	click(position2);
    }
    
    public void clickphone2()
    {
    	click(phone2);
    }
    
    public void clickworkdate1()
    {
    	click(workdate1);
    }
    
    public void clickuserid1()
    {
    	click(userid1);
    }
    
    public void clickaccount1()
    {
    	click(account1);
    }
    
    public void clicksex1()
    {
    	click(sex1);
    }
    
    public void clickqq1()
    {
    	click(qq1);
    }
    
    public void clickskype1()
    {
    	click(skype1);
    }
    
    public void clickyahoo1()
    {
    	click(yahoo1);
    }
    
    public void clickali1()
    {
    	click(ali1);
    }
    
    public void clickaddress1()
    {
    	click(address1);
    }
    
    public void clickmailid1()
    {
    	click(mailid1);
    }
    
    public void clickequal2()
    {
    	click(equal2);
    }
    
    public void clickunequal1()
    {
    	click(unequal1);
    }
    
    public void clickgreater1()
    {
    	click(greater1);
    }
    
    public void clickge1()
    {
    	click(ge1);
    }
    
    public void clicklessthan1()
    {
    	click(lessthan1);
    }
    
    public void clickle1()
    {
    	click(le1);
    }
    
    public void clickcontain5()
    {
    	click(contain5);
    }
    
    public void clickbetween1()
    {
    	click(between1);
    }
    
    public void clickuncontain1()
    {
    	click(uncontain1);
    }
    
    public void clickbelongto2()
    {
    	click(belongto2);
    }
    
    public void clickand7()
    {
    	click(and7);
    }
    
    public void clickor1()
    {
    	click(or1);
    }
    
    public void clickrealname3()
    {
    	click(realname3);
    }
    
    public void clickmail3()
    {
    	click(mail3);
    }
    
    public void clickowndepartment3()
    {
    	click(owndepartment3);
    }
    
    public void clickusername3()
    {
    	click(username3);
    }
    
    public void clickposition3()
    {
    	click(position3);
    }
    
    public void clickphone3()
    {
    	click(phone3);
    }
    
    public void clickworkdate2()
    {
    	click(workdate2);
    }
    
    public void clickuserid2()
    {
    	click(userid2);
    }
    
    public void clickaccount2()
    {
    	click(account2);
    }
    
    public void clicksex2()
    {
    	click(sex2);
    }
    
    public void clickqq2()
    {
    	click(qq2);
    }
    
    public void clickskype2()
    {
    	click(skype2);
    }
    
    public void clickyahoo2()
    {
    	click(yahoo2);
    }
    
    public void clickgtalk2()
    {
    	click(gtalk2);
    }
    
    public void clickali2()
    {
    	click(ali2);
    }
    
    public void clickaddress2()
    {
    	click(address2);
    }
    
    public void clickmailid2()
    {
    	click(mailid2);
    }
    
    public void clickequal3()
    {
    	click(equal3);
    }
    
    public void clickunequal2()
    {
    	click(unequal2);
    }
    
    public void clickgreater2()
    {
    	click(greater2);
    }
    
    public void clickge2()
    {
    	click(ge2);
    }
    
    public void clicklessthan2()
    {
    	click(lessthan2);
    }
    
    public void clickle2()
    {
    	click(le2);
    }
    
    public void clickcontain6()
    {
    	click(contain6);
    }
    
    public void clickbetween2()
    {
    	click(between2);
    }
    
    public void clickuncontain2()
    {
    	click(uncontain2);
    }
    
    public void clickbelongto3()
    {
    	click(belongto3);
    }
    
    public void clickand8()
    {
    	click(and8);
    }
    
    public void clickor2()
    {
    	click(or2);
    }
    
    public void clickrealname4()
    {
    	click(realname4);
    }
    
    public void clickmail4()
    {
    	click(mail4);
    }
    
    public void clickowndepartment4()
    {
    	click(owndepartment4);
    }
    
    public void clickusername4()
    {
    	click(username4);
    }
    
    public void clickposition4()
    {
    	click(position4);
    }
    
    public void clickphone4()
    {
    	click(phone4);
    }
    
    public void clickworkdate3()
    {
    	click(workdate3);
    }
    
    public void clickuserid3()
    {
    	click(userid3);
    }
    
    public void clickaccount3()
    {
    	click(account3);
    }
    
    public void clicksex3()
    {
    	click(sex3);
    }
    
    public void clickqq3()
    {
    	click(qq3);
    }
    
    public void clickskype3()
    {
    	click(skype3);
    }
    
    public void clickyahoo3()
    {
    	click(yahoo3);
    }
    
    public void clickgtalk3()
    {
    	click(gtalk3);
    }
    
    public void clickali3()
    {
    	click(ali3);
    }
    
    public void clickaddress3()
    {
    	click(address3);
    }
    
    public void clickmailid3()
    {
    	click(mailid3);
    }
    
    public void clickequal4()
    {
    	click(equal4);
    }
    
    public void clickunequal3()
    {
    	click(unequal3);
    }
    
    public void clickgreater3()
    {
    	click(greater3);
    }
    
    public void clickge3()
    {
    	click(ge3);
    }
    
    public void clicklessthan3()
    {
    	click(lessthan3);
    }
    
    public void clickle3()
    {
    	click(le3);
    }
    
    public void clickcontain7()
    {
    	click(contain7);
    }
    
    public void clickbetween3()
    {
    	click(between3);
    }
    
    public void clickuncontain3()
    {
    	click(uncontain3);
    }
    
    public void clickbelongto4()
    {
    	click(belongto4);
    }
    
    public void clickand9()
    {
    	click(and9);
    }
    
    public void clickor3()
    {
    	click(or3);
    }
    
    public void clickrealname5()
    {
    	click(realname5);
    }
    
    public void clickmail5()
    {
    	click(mail5);
    }
    
    public void clickowndepartment5()
    {
    	click(owndepartment5);
    }
    
    public void clickusername5()
    {
    	click(username5);
    }
    
    public void clickposition5()
    {
    	click(position5);
    }
    
    public void clickphone5()
    {
    	click(phone5);
    }
    
    public void clickworkdate4()
    {
    	click(workdate4);
    }
    
    public void clickuserid4()
    {
    	click(userid4);
    }
    
    public void clickaccount4()
    {
    	click(account4);
    }
    
    public void clicksex4()
    {
    	click(sex4);
    }
    
    public void clickqq4()
    {
    	click(qq4);
    }
    
    public void clickskype4()
    {
    	click(skype4);
    }
    
    public void clickyahoo4()
    {
    	click(yahoo4);
    }
    
    public void clickgtalk4()
    {
    	click(gtalk4);
    }
    
    public void clickali4()
    {
    	click(ali4);
    }
    
    public void clickaddress4()
    {
    	click(address4);
    }
    
    public void clickmailid4()
    {
    	click(mailid4);
    }
    
    public void clickequal5()
    {
    	click(equal5);
    }
    
    public void clickunequal4()
    {
    	click(unequal4);
    }
    
    public void clickgreater4()
    {
    	click(greater4);
    }
    
    public void clickge4()
    {
    	click(ge4);
    }
    
    public void clicklessthan4()
    {
    	click(lessthan4);
    }
    
    public void clickle4()
    {
    	click(le4);
    }
    
    public void clickcontain8()
    {
    	click(contain8);
    }
    
    public void clickbetween4()
    {
    	click(between4);
    }
    
    public void clickuncontain4()
    {
    	click(uncontain4);
    }
    
    public void clickbelongto5()
    {
    	click(belongto5);
    }
    
    public void clickand10()
    {
    	click(and10);
    }
    
    public void clickor4()
    {
    	click(or4);
    }
    
    public void clickrealname6()
    {
    	click(realname6);
    }
    
    public void clickmail6()
    {
    	click(mail6);
    }
    
    public void clickowndepartment6()
    {
    	click(owndepartment6);
    }
    
    public void clickusername6()
    {
    	click(username6);
    }
    
    public void clickposition6()
    {
    	click(position6);
    }
    
    public void clickphone6()
    {
    	click(phone6);
    }
    
    public void clickworkdate5()
    {
    	click(workdate5);
    }
    
    public void clickuserid5()
    {
    	click(userid5);
    }
    
    public void clickaccount5()
    {
    	click(account5);
    }
    
    public void clicksex5()
    {
    	click(sex5);
    }
    
    public void clickqq5()
    {
    	click(qq5);
    }
    
    public void clickskype5()
    {
    	click(skype5);
    }
    
    public void clickyahoo5()
    {
    	click(yahoo5);
    }
    
    public void clickgtalk5()
    {
    	click(gtalk5);
    }
    
    public void clickali5()
    {
    	click(ali5);
    }
    
    public void clickaddress5()
    {
    	click(address5);
    }
    
    public void clickmailid5()
    {
    	click(mailid5);
    }
    
    public void clickequal6()
    {
    	click(equal6);
    }
    
    public void clickunequal5()
    {
    	click(unequal5);
    }
    
    public void clickgreater5()
    {
    	click(greater5);
    }
    
    public void clickge5()
    {
    	click(ge5);
    }
    
    public void clicklessthan5()
    {
    	click(lessthan5);
    }
    
    public void clickle5()
    {
    	click(le5);
    }
    
    public void clickcontain9()
    {
    	click(contain9);
    }
    
    public void clickbetween5()
    {
    	click(between5);
    }
    
    public void clickuncontain5()
    {
    	click(uncontain5);
    }
    
    public void clickbelongto6()
    {
    	click(belongto6);
    }
    
    public void clickand11()
    {
    	click(and11);
    }
    
    public void clickor5()
    {
    	click(or5);
    }
    
    public void clickrealname7()
    {
    	click(realname7);
    }
    
    public void clickmail7()
    {
    	click(mail7);
    }
    
    public void clickowndepartment7()
    {
    	click(owndepartment7);
    }
    
    public void clickusername7()
    {
    	click(username7);
    }
    
    public void clickposition7()
    {
    	click(position7);
    }
    
    public void clickphone7()
    {
    	click(phone7);
    }
    
    public void clickworkdate6()
    {
    	click(workdate6);
    }
    
    public void clickuserid6()
    {
    	click(userid6);
    }
    
    public void clickaccount6()
    {
    	click(account6);
    }
    
    public void clicksex6()
    {
    	click(sex6);
    }
    
    public void clickqq6()
    {
    	click(qq6);
    }
    
    public void clickskype6()
    {
    	click(skype6);
    }
    
    public void clickyahoo6()
    {
    	click(yahoo6);
    }
    
    public void clickgtalk6()
    {
    	click(gtalk6);
    }
    
    public void clickali6()
    {
    	click(ali6);
    }
    
    public void clickaddress6()
    {
    	click(address6);
    }
    
    public void clickmailid6()
    {
    	click(mailid6);
    }
    
    public void clickequal7()
    {
    	click(equal7);
    }
    
    public void clickunequal6()
    {
    	click(unequal6);
    }
    
    public void clickgreater6()
    {
    	click(greater6);
    }
    
    public void clickge6()
    {
    	click(ge6);
    }
    
    public void clicklessthan6()
    {
    	click(lessthan6);
    }
    
    public void clickle6()
    {
    	click(le6);
    }
    
    public void clickcontain10()
    {
    	click(contain10);
    }
    
    public void clickbetween6()
    {
    	click(between6);
    }
    
    public void clickuncontain6()
    {
    	click(uncontain6);
    }
    
    public void clickbelongto7()
    {
    	click(belongto7);
    }
    
    public void clickid()
    {
    	click(id);
    }
    
    public void clickrealname8()
    {
    	click(realname8);
    }
    
    public void clickusername8()
    {
    	click(username8);
    }
    
    public void clickposition8()
    {
    	click(position8);
    }
    
    public void clickmail8()
    {
    	click(mail8);
    }
    
    public void clicksex7()
    {
    	click(sex7);
    }
    
    public void clickphone8()
    {
    	click(phone8);
    }
    
    public void clickqq7()
    {
    	click(qq7);
    }
    
    public void clickworkdate7()
    {
    	click(workdate7);
    }
    
    public void clicklastloginLink()
    {
    	click(lastloginLink);
    }
    
    public void clickvisitLink()
    {
    	click(visitLink);
    }
}
