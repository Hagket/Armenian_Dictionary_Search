# HAGOP KETCHEDJIAN
# CREATED ON 4/6/2024

from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from time import sleep

options = Options()
#options.add_experimental_option("detach", True)    #Use during developement only
driver = webdriver.Chrome(options=options)

for i in range (1000):          # Range can be changed for the amount of words you want to be printed
    driver.get("http://nayiri.com/search?dt=HY_EN&query=&l=en")     # Go to Nayiri.com
    driver.find_element("xpath", "//*[@id='searchContainer']/div[2]/form/div[4]/button").click()    # Find the random word button and click it
    sleep(1)                    # Wait 1 second for the word to load
    word = driver.find_element("xpath", "//*[@id='searchQueryInput']").get_attribute("value")       # Get the word from the text box

    one_word = True             # Boolean which represents if the current word is a single word or multiple (we only want single words)
    for j in range(len(word)):  # Go through every character of the word and if a space is detected exit the loop
        if (word[j] == ' '): one_word = False; break
    if (one_word): print(word)  # If the word is a single word print it