
"use strict";

/**
 * Home page Search
 */

const /** {NodeElement} */ $searchField = document.querySelector("[data-search-field]");
const /** {NodeElement} */ $searchBtn = document.querySelector("[data-search-btn]");

$searchBtn.addEventListener("click" ,function(){
    if ($searchField.value) window.location = `/recipes.html?q=${$searchField.value}`;
});