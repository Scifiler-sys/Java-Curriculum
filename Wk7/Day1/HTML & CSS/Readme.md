# HTML
* Hypertext Markup Language
* Another markup language so that means it is just telling the computer what to do and not compiling it into machine code
* Very similar to xml (our .csproj files) but HTML is used to define the structure of our webpages
* Our browsers are essentially experts at reading this files and interpreting it to display something on the browser
* We are currently on version HTML 5

## HTML elements
* They are basic graphical units that will display display or structure your web page

## HTML Tags
* Don't confuse with HTMl elements although they are used synonymously online
* HTML element is the actual unit while HTML tag is used to refer to that HTML element
* Ex: paragraph HTML element will display long text in your website and you use `<p> <\p>` HTML tag to display it

## Inline vs Block element
* Inline elements will display the two HTML element in the same line (or side by side)
* Block elements will display the two HTML elements in different line\
* Ex: println() will display text line by line which is the same for block elements, print() will display text in the same line which is the same for inline elements

## HTML semantic elements
* A new edition to HTMl5 that confused a bunch of people or not even bother using it
* It is a HTML element that is used to give more information just exactly what are you trying to display in this particular section of the HTML file
* TLDR a proper way to "structure" your HTML file so the next person will understand more clearly what you are doing

## HTML attributes
* They are used to provide extra information that the tag can use
* Ex: img tag using src attribute to find a specific image to display

# CSS
* Cascading Style Sheets
    * Cascading is in the name because it uses a cascading algorithm to determine what style it should apple (more on this later)
* A way to stop making your website looking like it came from the 90s

## CSS Selectors
* Before applying styles everywhere, we need a way to select specific or group of HTMl elements first so we give them their own type of look
* There are three basic fundamental selectors we should keep in mind:
1. Id selector - When you want to select one element using the id attribute
2. Class selector - When you want to select multiple elements of differing tag by using the class attribute
3. Element selector - When you want to select multiple elements of the same tag

## Different ways to include CSS
* Inline CSS
    * Applies CSS to a single element
    * It uses the style attribute
    * Has the higest priority
* Internal CSS
    * Applies CSS by using the style tag inside of a HTML doc
    * Used to apply multiple css to multiple elements
* External CSS
    * Creating an external .css file to apply css to multiple HTML docs (you can just apply it to one HTML but that kind of defeats the purpose of using an external css)
    * HTML doc must use the link tag to reference the external css
    * Used to apply multiple css to multiple elements in multiple HTML docs
        * So useful to create a universal theme of your website

## CSS Specificity
* Key thing is the term "Specificity"
* This will determine what style we should apply to a particular element because sometimes some styling will collide with another
* General rule (but it definitely gets more complicated than this): 
    * Inline css will have a very high priority
    * Id selector will have the second priority
    * Class selector will have the third
    * Element selector will have the last

## CSS Box Model
* A way to enlarge/separate/resize your elements into the right size and spacing

## CSS Grid
* A way to put elements in a grid like system

# Responsive Web Design
* Making your elements not have rigid in size but changes its size based on the viewport
    * Viewport is just how big the window of the browser is (small for phones, big for computers)
* Useful to accomodate for every devices out there that might access your website
* We will leverage Bootstrap libraries for pre-made css files to implement this design
    * Click [here](https://getbootstrap.com/docs/5.1/getting-started/introduction/) for Bootstrap documentation