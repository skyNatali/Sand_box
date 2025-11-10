
//        browser.get("https://www.saucedemo.com/");
//        browser.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
//        browser.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
//        browser.findElement(By.xpath("//input[@value='Login']")).click();
//        boolean registerBtnPresent = browser.findElement(By.xpath("//span[@data-test='title']")).isDisplayed();
//        assertTrue(registerBtnPresent);
//        browser.quit();
//    }
//
//    @Test
//    public void user_name() {
//        WebDriver browser = new EdgeDriver();
//        browser.get("https://www.saucedemo.com/");
//        browser.findElement(By.xpath("//input[@data-test='username']")).sendKeys("locked_out_user");
//        browser.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
//        browser.findElement(By.xpath("//input[@value='Login']")).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        String errorText = browser.findElement(By.cssSelector(".error-message-container.error")).getText();
//        assertEquals(errorText, "Epic sadface: Sorry, this user has been locked out.");
//        browser.quit();
//    }
//}