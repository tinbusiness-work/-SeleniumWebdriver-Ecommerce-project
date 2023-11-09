[SeleniumWebdriver] Ecommerce project 

Hi There Testers, Friends, Teacher and Everyone 

You are the Selenium automation engineer assigned to test the an ecommerce project.

Here is a link to the AUT - http://live.techpanda.org/index.php/

The following test case needs to be automated:

------------------------------------TC01--------------------------------------------

/*

Test Steps

Step 1. Go to http://live.techpanda.org/

Step 2. Verify Title of the page

Step 3. Click on -> MOBILE -> menu

Step 4. In the list of all mobile , select SORT BY -> dropdown as name

Step 5. Verify all products are sorted by name

*/

------------------------------------TC02--------------------------------------------

The client wants you to verify the following scenario: “Verify that cost of product in list page and details page are equal”.

Go ahead and automate this -

/*

Test Steps:

1. Goto http://live.techpanda.org/

2. Click on -> MOBILE -> menu

3. In the list of all mobile , read the cost of Sony Xperia mobile (which is $100)

4. Click on Sony Xperia mobile

5. Read the Sony Xperia mobile from detail page.

6. Compare Product value in list and details page should be equal ($100).

*/

----------------------------TC03------------------------------------------
Hey there,

The client wants to automate the scenario:

“Verify that you cannot add more product in cart than the product available in store”

/*

Test Steps:

1. Go to http://live.techpanda.org/

2. Click on -> MOBILE -> menu

3. In the list of all mobile , click on -> ADD TO CART for " Sony Xperia " mobile

4. Change "QTY' value to '1000' and click -> UPDATE -> button. Expected that an error is displayed " The requested quantity for "Sony Xperia" is not available. "

5. Verify the error message

6. Then click on -> EMPTY CART -> link in the footer of list of all mobiles. A message "SHOPPING CART IS EMPTY" is shown.

7. Verify cart is empty

---------------------------------------------------TC04-------------------------------------------

The next scenario is “Verify that you are able to compare two product”

This will need you to work with pop-ups.

/*

Test Steps:

1. Go to http://live.techpanda.org/

2. Click on -> MOBILE -> menu

3. In mobile products list , click on -> Add To Compare -> for 2 mobiles (Sony Xperia & Iphone)

4. Click on -> COMPARE button. A popup window opens

5. Verify the pop-up window and check that the products are reflected in it

Heading "COMPARE PRODUCTS" with selected products in it.

6. Close the Popup Windows

*/

--------------------------------TESTCASE05--------------------------------------

The next scenario is “Verify you can create account in E-commerce site and can share wishlist to other people using email”

Detailed Test Case is below

/* Verify can create an account in e-Commerce site and can share wishlist to other poeple using email.

Test Steps:

1. Go to http://live.techpanda.org/

2. Click on my account link

3. Click Create an Account link and fill New User information excluding the registered Email ID.

4. Click Register

5. Verify Registration is done. Expected account registration done.

6. Go to TV menu

7. Add product in your wish list - use product - LG LCD

8. Click SHARE WISHLIST

9. In next page enter Email and a message and click SHARE WISHLIST

10.Check wishlist is shared. Expected wishlist shared successfully.

Note: 

- build Register page as POM.

- code for switching to new window:

// switching to new window
for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
}
*/

-----------------------TESTCASE06-------------------------                

Hey there,

The next scenario is:

/* Verify user is able to purchase product using registered email id (USE CHROME BROWSER)

Test Steps:

1. Go to http://live.techpanda.org/

2. Click on my account link

3. Login in application using previously created credential

4. Click on MY WISHLIST link

5. In next page, Click ADD TO CART link

6. Enter general shipping country, state/province and zip for the shipping cost estimate

7. Click Estimate

8. Verify Shipping cost generated

9. Select Shipping Cost, Update Total

10. Verify shipping cost is added to total

11. Click "Proceed to Checkout"

12a. Enter Billing Information, and click Continue

12b. Enter Shipping Information, and click Continue

13. In Shipping Method, Click Continue

14. In Payment Information select 'Check/Money Order' radio button. Click Continue

15. Click 'PLACE ORDER' button

16. Verify Oder is generated. Note the order number

Note: 

- Build CartPage/CheckOutPage/LoginPage as POM

*/--------------TESTCASE07-------------------------/* 

Verify that you will be able to save previously placed order as a pdf file

Test Steps:

1. Go to http://live.techpanda.org/

2. Click on My Account link

3. Login in application using previously created credential

4. Click on 'My Orders'

5. Click on 'View Order'

6. Click on 'Print Order' link

Go ahead and code the script.

Good luck!

*/--------------TESTCASE08-------------------------/

*  Verify you are able to change or reorder previously added product

 *  Test Data = QTY = 10

Test Steps:

1. Go to http://live.techpanda.org/

2. Click on my account link

3. Login in application using previously created credential

4. Click on 'REORDER' link , change QTY & click Update

5. Verify Grand Total is changed

6. Complete Billing & Shipping Information

7. Verify order is generated and note the order number

Expected outcomes:

1) Grand Total is Changed

2) Order number is generated

   
*/--------------TESTCASE09-------------------------*/

/*  Verify Discount Coupon works correctly

Test Case Description:

1. Go to http://live.techpanda.org/

2. Go to Mobile and add IPHONE to cart

3. Enter Coupon Code

4. Verify the discount generated

TestData:  Coupon Code: GURU50

Expected result:

1) Price is discounted by 5%

*/

*/--------------------------TESTCASE10---------------------------------*/

The client wants you to work on the scenario “Export all Orders in csv file and display these information in console and you are able to send this file to another email id as attachment”

/* Test Case requirements/descriptions:
 *    Export all Orders in csv file and display these information in console and
 *    you are able to send this file to another email id as attachment
 * Note: Access to backend of the site. UserId "user01" and pw "user001"
 *
1. Go to http://live.techpanda.org/index.php/backendlogin
2. Login the credentials provided
3. Go to Sales-> Orders menu
4. Select 'CSV' in Export To dropdown and click Export button.

Expected results:
1) File is downloaded successfully with full information.
*/

Backed Login Credentials (without quotes)

id = "user01"

pass = "guru99com"

Good luck!

**Source code and reference:
https://github.com/chile122/selenium-webdriver-java/tree/master
https://codelearn.io/sharing/xac-dinh-vi-tri-element-voi-automation-test
https://www.selenium.dev/documentation/webdriver/elements/
https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html#develop_with_maven

My Project Default JDK is 11. You need to change JDK version on your computer
