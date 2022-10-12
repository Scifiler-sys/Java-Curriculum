# HTML
* Hypertext Markup Language
* Another markup language so that means it is just telling the computer what to do and not compiling it into machine code
* Very similar to xml (our .csproj files) but HTML is used to define the structure of our webpages
* Our browsers are essentially experts at reading this files and interpreting it to display something on the browser
* We are currently on version HTML 5

## HTML elements
* They are a basic graphical unit of something you want to display/structure on your web page
## HTML tags
* They are what you write in an HTML file to reference the HTML element you want to add
* Ex: I want to add an HTML paragraph element by typing ``<p></p>`` HTML tag
## Inline vs. Block elements
* Block elements will add a new line every time you create that element
* Inline element will not add a new line when you create that element
## Semantic tags
* Whole purpose of semantic tags is to express a clearly defined purpose of a certain section of your HTML file
* Unlike a div or span element that tells you absolutely nothing of what is going to be inside the contents
* Ex: table, article, form, etc.
## HTML attributes
* They are used to provide extra information that the tag can use
* Some changes the behavior or extends the functionality of the tag
* Ex: img tag using src attribute to find a specific image to display

# CSS
* Cascading Style Sheets
    * Cascading is in the name because the styling is determined by cascading down from one source to another source to another source and so on...
* A way to stop making your website looking like it came from the 90s

## CSS Selectors
* Before applying styles everywhere, we need a way to select specific or group of HTMl elements first so we give them their own type of look
* There are three basic fundamental selectors we should keep in mind:
1. Element selector - When you want to select multiple elements of the same tag
2. Class selector - When you want to select multiple elements of differing tag by using the class attribute
3. Id selector - When you want to select one elements using the id attribute

## Different ways to include CSS
* Inline CSS
    * Applies CSS to a single element
    * It uses the style attribute
* Internal CSS
    * Applies CSS by using the style tag inside of a HTML doc
    * Used to apply multiple css to multiple elements
* External CSS
    * Creating an external .css file to apply css to multiple HTML docs (you can just apply it to one HTML but that kind of defeats the purpose of using an external css)
    * HTML doc must use the link tag to reference the external css
    * Used to apply multiple css to multiple elements in multiple HTML docs
        * So useful to create a universal theme of your website

## Box Model
* Great for us to move elements around the page to a specific location that we want
* From inner to outer:
    Content > Padding > Border > Margin
* I would look into css flexbox to really help with positioning things in your website. Unfortunately, we don't have to cover it but it is really useful.
    * https://css-tricks.com/snippets/css/a-guide-to-flexbox

## CSS Specificity
* When it gets murky on what element to choose to apply the css to
* 

# Responsive Web Design
* Making your elements not have rigid in size but changes its size based on the viewport
    * Viewport is just how big the window of the browser is (small for phones, big for computers)
* Useful to accomodate for every devices out there that might access your website
* We will leverage Bootstrap libraries for pre-made css files to implement this design
    * Click [here](https://getbootstrap.com/docs/5.1/getting-started/introduction/) for Bootstrap documentation

