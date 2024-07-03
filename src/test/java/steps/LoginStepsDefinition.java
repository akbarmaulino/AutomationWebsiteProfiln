package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertTrue;



public class LoginStepsDefinition {

    //    Initiation
    public static WebDriver driver;

    @Given("User go to Profiln Website")
    public void user_go_to_profiln_website() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-fullscreen");
        System.setProperty("webdriver.chrome.driver", "D:\\Aplikasi Donwload\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("http://localhost:3000/auth/login");
    }

    //    Fill Email or Password
    @When("User Fill Valid Credential")
    public void user_fill_valid_credential() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.sendKeys("fazri.egi@binar.co.id");
        passwordInput.sendKeys("Coba123!");
    }

    @When("User Fill Invalid Credential")
    public void user_fill_invalid_credential() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.sendKeys("egi123@mail.com");
        passwordInput.sendKeys("Coba123!");
    }

    @When("User Fill Password Only")
    public void user_fill_password_only() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.click();
        passwordInput.sendKeys("Coba123!");
    }

    @When("User Fill Email Only")
    public void user_fill_email_only() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        passwordInput.click();
        usernameInput.sendKeys("egi123@mail.com");
    }

    @When("User Fill User Fill Kurang Dari 8 karakter Password")
    public void user_fill_invalid_Karakter_password() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.sendKeys("fazri.egi@binar.co.id");
        passwordInput.sendKeys("123");
    }

    @When("User Fill Password Without Any Spesial Characters")
    public void user_fill_password_without_any_spesial_character() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.sendKeys("fazri.egi@binar.co.id");
        passwordInput.sendKeys("Test1234");
    }

    @When("User Fill Password Without Any Uppercase")
    public void User_Fill_Password_Without_Any_Uppercase() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.sendKeys("fazri.egi@binar.co.id");
        passwordInput.sendKeys("test1234!");
    }

    @When("User Fill Email Without Correct Email Format")
    public void User_Fill_Email_Without_Correct_Email_Format() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.sendKeys("fazri.egi");
        passwordInput.sendKeys("test1234!");
    }

    @When("User Fill User Fill Kurang Dari 10 karakter Email")
    public void User_Fill_User_Fill_Kurang_Dari_10_karakter_Email() {
        WebElement usernameInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        usernameInput.sendKeys("f@com");
        passwordInput.sendKeys("123");
    }

    //    Button
    @When("User Klik Login Using Google")
    public void user_klik_login_using_google() {
        WebElement button = driver.findElement(By.cssSelector("button.css-xk15mf-ButtonWithIcon.btn.btn-primary"));




        if (button.isDisplayed()) {
            System.out.println("Element is visible.");
        } else {
            System.out.println("Element is not visible.");
        }
        if (button.isEnabled()) {
            System.out.println("Element is enabled and interactable.");
        } else {
            System.out.println("Element is disabled.");
        }
        Actions actions = new Actions(driver);
        actions.moveToElement(button).click().perform(); // Single Klik
        actions.moveToElement(button).doubleClick().perform(); // Double Klik

    }

    @When("User Klik Forgot Password")
    public void user_clicks_forgot_password_link() {
        WebElement forgotPasswordLink = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[3]/a/p"));
        forgotPasswordLink.click();
    }

    @When("User Klik Register now in haven't chosen an account yet?")
    public void user_klik_register_now() {
        WebElement forgotPasswordLink = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[5]/p/a"));
        forgotPasswordLink.click();
    }

    //    Remember Me?
    @When("User Checked Remember Me? box")
    public void user_checks_remember_me_box() {
        WebElement rememberMeCheckbox = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[3]/div/input"));
        if (!rememberMeCheckbox.isSelected()) {
            rememberMeCheckbox.click();
        }
    }

    @When("User Checked Remember Me? boxx")
    public void user_checks_remember_me_boxx() {
        WebElement rememberMeCheckbox = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[3]/div/input"));
        if (!rememberMeCheckbox.isSelected()) {
            rememberMeCheckbox.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeSelected(rememberMeCheckbox));
            rememberMeCheckbox.click();
        }
    }

    // Logout
    @Then("User Klik Icon Profile")
    public void user_klik_icon_profile(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/nav/div/div[2]/div/a")));

        element1.click();
    }
    @Then("User Klik Logout")
    public void user_klik_logout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/nav/div/div[2]/div/div/a[2]/button")));

        element1.click();

        String expectedUrl = "http://localhost:3000/auth/login";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        assertTrue("User is not directed to the expected post page.", currentUrl.contains(expectedUrl));
        System.out.println("Anda Berada di url Login : " + currentUrl);

        driver.quit();
    }
    //My Post
    @Then("Click My Post Image")
    public void click_my_post_image(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/nav/div/div[2]/a[2]/img")));

        element1.click();
    }

    @Then("User Should be Directed to My Post Page")
    public void user_should_be_directed_to_my_post_page(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String expectedUrl = "http://localhost:3000/my_post";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        assertTrue("User is not directed to the expected post page.", currentUrl.contains(expectedUrl));
        System.out.println("Anda Berada di url My Post : " + currentUrl);

        driver.quit();
    }
    @Then("User Click Disukai")
    public void user_click_disukai(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/main/main/div[1]/div/div[1]/div/div/button[1]")));
        element1.click();
    }
    @Then("User Should be Directed to Disukai Page")
    public void user_should_be_directed_to_disukai_page(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String expectedUrl = "http://localhost:3000/my_post?post=liked";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        assertTrue("User is not directed to the expected post page.", currentUrl.contains(expectedUrl));
        System.out.println("Anda Berada di url Disukai : " + currentUrl);

        driver.quit();
    }

    @Then("User Click Dropdown Postingan")
    public void user_click_dropdwon_postingan(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/main/main/div[1]/div/div[1]/h2/button")));
        element1.click();
        driver.quit();
    }

    @Then("User Click three dots")
    public void user_click_three_dots(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/main/main/div[2]/div/div[1]/div/button/svg")));
        element1.click();
        driver.quit();
    }

    @Then("User Click Repost")
    public void user_click_repost(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/main/main/div[1]/div/div[1]/div/div/button[2]")));
        element1.click();
    }

    @Then("User Click Portofolio")
    public void user_click_Portofolio(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Portfolio")));
        element1.click();
    }

    @Then("User Should be Directed to Repost Page")
    public void user_should_be_directed_to_repost_page(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String expectedUrl = "http://localhost:3000/my_post?post=repost";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        assertTrue("User is not directed to the expected post page.", currentUrl.contains(expectedUrl));
        System.out.println("Anda Berada di url Repost : " + currentUrl);

        driver.quit();
    }

    @Then("User Should be Directed to Portofolio Page")
    public void user_should_be_directed_to_portofolio_page(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String expectedUrl = "http://localhost:3000/my_post?post=portfolio";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String currentUrl = driver.getCurrentUrl();
        assertTrue("User is not directed to the expected post page.", currentUrl.contains(expectedUrl));
        System.out.println("Anda Berada di url Portofolio : " + currentUrl);

        driver.quit();
    }

    //    Move Page
    @Then("User Should be Directed to Registration Page")
    public void user_should_be_directed_to_registration_page() {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/register")); // Ganti sesuai bagian URL yang cocok

        // Verifikasi URL
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/register")) { // Ganti sesuai bagian URL yang cocok
            System.out.println("User is successfully directed to Forgot Password page");
        } else {
            System.out.println("User is not directed to Forgot Password page");
        }
        driver.quit();
    }

    @Then("User Should be Directed to Forgot Password Page")
    public void user_should_be_directed_to_forgot_password_page() {
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/forget")); // Ganti sesuai bagian URL yang cocok

        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("/forget")) { // Ganti sesuai bagian URL yang cocok
            System.out.println("User is successfully directed to Forgot Password page");
        } else {
            System.out.println("User is not directed to Forgot Password page");
        }
        driver.quit();
    }

    @Then("User Should be Directed to Homepage")
    public void user_should_be_directed_to_homepage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/nav/div/div[2]/div")));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/nav/div/a/img")));

        if (element1.isDisplayed() && element2.isDisplayed()) {
            System.out.println("Element Homepage and Element Beranda is displayed and visible");
        } else {
            System.out.println("Element is not displayed or visible.");
        }

        driver.quit();

    }

    //    Checked
    @Then("The Remember Me Box Is Successfully Checked")
    public void the_remember_me_box_is_successfully_checked() {
        WebElement rememberMeCheckbox = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[3]/div/input"));
        if (rememberMeCheckbox.isSelected()) {
            System.out.println("Remember Me box is successfully checked");
        } else {
            System.out.println("Remember Me box is not checked");
        }
        driver.quit();
    }

    @Then("The Remember Me Box Is Successfully Uncheck")
    public void the_remember_me_box_is_successfully_unchecked() {
        WebElement rememberMeCheckbox = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[3]/div/input"));
        if (!rememberMeCheckbox.isSelected()) {
            System.out.println("Remember Me box is successfully unchecked");
        } else {
            System.out.println("Remember Me box is still checked");
        }
        driver.quit();
    }

//    Notification
    @Then("User Should be get Notification Error For Password")
    public void user_should_be_get_notification_Error_for_password() {
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/img")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/div[2]")));
        String text = element.getText();
        if (text.equals("Minimal 8 karakter") || text.equals("Minimal berisi satu karakter spesial dan bukan underscore '_'") || text.equals("Minimal berisi satu karakter huruf besar") || text.equals("Anda belum mengisi password")) {
            System.out.println("Element found!: " + text);
        } else {
            System.out.println("Element not found: " + text);
        }
        driver.quit();
    }

    @Then("User Should be get Notification that Email atau Password Salah")
    public void user_should_be_get_notification_that_email_atau_password_salah() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/p")));
        String text = element.getText();
        if (text.equals("Email atau Password Salah")) {
            System.out.println("Element found!: " + text);
        } else {
            System.out.println("Element not found: " + text);
        }
        driver.quit();
    }

    @Then("User Should be get Notification Error For Email")
    public void user_should_be_get_notification_Error_for_Email() {
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/div[1]/img")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[1]/div[2]/div/div")));
        String text = element.getText();
        if (text.equals("email minimal 10 karakter") || text.equals("Maaf penulisan email belum tepat. Misal: name@email.com") || text.equals("Anda belum mengisi email")) {
            System.out.println("Element found!: " + text);
        } else {
            System.out.println("Element not found: " + text);
        }
        driver.quit();
    }

    //    Click
    @Then("User Klik Eye Icon")
    public void user_klik_eye_icon() {
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/div[1]/img")).click();
    }

    @Then("User Klik Eye Iconn")
    public void user_klik_eye_iconn() {
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/div[1]/img")).click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/div[1]/img")).click();
    }

    @Then("User Klik Account")
    public void user_click_account() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/form/span/section/div/div/div/div/ul/li[1]")));
        element.click();
    }

    @Then("User Click Login")
    public void user_click_login() {
        driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[4]/button")).click();
    }

    //    Hide/Unhide
    @Then("User Can Unhide Password")
    public void user_can_unhide_password() {
        WebElement passwordField = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        String fieldType = passwordField.getAttribute("type");
        if (fieldType.equals("text")) {
            System.out.println("Password is unhidden");
        } else {
            System.out.println("Password is still hidden");
        }
        driver.quit();
    }

    @Then("User Can Hide Password")
    public void user_can_hide_hide_password() {
        WebElement passwordField = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[2]/div[2]/div/input"));
        String fieldType = passwordField.getAttribute("type");
        if (fieldType.equals("password")) {
            System.out.println("Password is hidden");
        } else {
            System.out.println("Password is still unhidden");
        }
        driver.quit();
    }

    //    Fill
    @Then("User Fill Registered Account Google")
    public void user_fill_registered_account_google() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            String currentWindow = driver.getWindowHandle();

            Set<String> windows = driver.getWindowHandles();
            for (String windowHandle : windows) {
                if (!windowHandle.equals(currentWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("akbar.maulino@binar.co.id");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text() = 'Next']")));
            driver.findElement(By.xpath("//span[text() = 'Next']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Maulino1234@");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text() = 'Next']")));
            driver.findElement(By.xpath("//span[text() = 'Next']")).click();

            driver.quit();

    }

    //    Disabled
    @Then("The Login Button Remains Disabled")
    public void the_login_button_remains_disabled() {
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div/form/div[4]/button"));
        boolean isDisabled = button.getAttribute("disabled") != null;
        if (isDisabled) {
            System.out.println("Button is disabled");
        } else {
            System.out.println("Button is enabled");
        }
    }
}

