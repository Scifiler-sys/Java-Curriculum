# What is Jest?
* Jest is a javascript testing framework utilized with react
    * The only framework we have added to our React
    * Why is it a framework? Well we don't handle the control flow of how Jest will run, we just dictate the test cases and then let it do its thing
* Testing in the frontend is a little bit different from the backend
    * You would need to emulate user actions just to test if the behavior of your component does what it does
        * Ex: Clicking a button and see if a new HTML element appears
    
* To install `npm install --save-dev jest babel-jest @babel/preset-env @babel/preset-react react-test-renderer`

# What is React Testing Library?
* it is a dependency that allows us to test the DOM tree rendered to the browser
* this allows us to write tests that resemble how a user would use the application
* Keywords for RTL:
    * render : allows us to render a component to test
    * screen : allows us to query elements from the rendered component
        * methods for querying from the component
            * getByText() : goes through the component tree and looks for elements that specific text
            * getByTestId() : we can add an attribute to an element to retrieve it that way
                * data-testid=""
            * getByRole() 
                * can retrieve the role attribute in the html element
                * if there isnt one, you can access it by the tag name
                * getPlaceholderText() : by input placeholder values

# Deploying React to AWS