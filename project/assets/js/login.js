const wrapper = document.querySelector('.wrapper');
const loginLink = document.querySelector('.login-link');
const registerLink = document.querySelector('.register-link');
const btnPopup = document.querySelector('.btnLogin-popup');
const iconClose = document.querySelector('.item-close');
const iconvisibility = document.querySelector('.visibility');
const iconvisibilityoff = document.querySelector('.visibilityoff');

registerLink.addEventListener("click", ()=> {
    wrapper.classList.add('active');
})

loginLink.addEventListener("click", ()=> {
    wrapper.classList.remove('active');
})

btnPopup.addEventListener("click", ()=> {
    wrapper.classList.add('active-popup');
})

iconClose.addEventListener("click", ()=> {
    wrapper.classList.remove('active-popup');
})

iconvisibility.addEventListener("click", ()=> {
    wrapper.classList.add('active-open');

    let passwordInput = iconvisibility.parentElement.querySelector("input");
    if (passwordInput.type === "password") {
        passwordInput.type = "text";
    }
})

iconvisibilityoff.addEventListener("click", ()=> {
    wrapper.classList.remove('active-open');
    
    let passwordInput = iconvisibilityoff.parentElement.querySelector("input");
    if (passwordInput.type === "text") {
        passwordInput.type = "password";
    }
})