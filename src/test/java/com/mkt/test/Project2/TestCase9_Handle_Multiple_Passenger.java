package com.mkt.test.Project2;

import org.testng.annotations.Test;

import com.mkt.source.Project2.Search_Flight_Page1;

import maven.SpiceJet.Login_Page;
import maven.SpiceJet.Passenger_details_Page;

public class TestCase9_Handle_Multiple_Passenger extends LunchQuit{
	
	@Test
	public void Check_details_link_searchresultpage() throws InterruptedException
	{
		Login_Page logpage=new Login_Page(driver);
		logpage.login_link_click();
		Thread.sleep(4000);
		logpage.mobilenumber_select();
		logpage.enter_mobile_number();
		logpage.enter_password();
		logpage.click_login_button();
		Search_Flight_Page1 seaflight1=new Search_Flight_Page1(driver);
		Thread.sleep(4000);
		seaflight1.enter_flightsource(driver);
		seaflight1.enter_flightdestination(driver);
		Thread.sleep(2000);
		seaflight1.select_month_year_depature_date();
		seaflight1.click_passenger_dropdown();
		seaflight1.click_add_passenger();
		seaflight1.click_search_flight_button(driver);
		Links_SearchResult_Page searchres=new Links_SearchResult_Page(driver);
		Thread.sleep(4000);
		searchres.click_Flight_Details_link(driver);
		searchres.scroll_flightinfo(driver);
		Thread.sleep(2000);
		searchres.click_baggagelink();
		Thread.sleep(2000);
		searchres.click_cancellationlink();
		Links_SearchResult_Page searchpage=new Links_SearchResult_Page(driver);
		searchpage.click_continue_button();
		Passenger_details_Page passdetails=new Passenger_details_Page(driver);
		passdetails.enter_towncity(driver);
		passdetails.enter_pass_firstname();
		passdetails.enter_pass_lastname();
		passdetails.enter_pass_phonenumber();
		passdetails.click_next_button();
		passdetails.enter_pass2_firstname();
		passdetails.enter_pass2_lastname();
		passdetails.enter_pass2_phonenumber();
		passdetails.click_next_button();
		passdetails.enter_pass3_firstname();
		passdetails.enter_pass3_lastname();
		passdetails.enter_pass3_phonenumber();
		passdetails.click_pass_continue_button();
	}

}
