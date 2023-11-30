
"use strict";

window.ACCESS_POINT = "https://api.edamam.com/api/recipes/v2";
const /** {String} */ APP_ID = "22215f11";
const /** {String} */ API_KEY = "0d89a6c87bba49102fb456cbe4645de2";
const /** {String} */ TYPE = "public";

export const fetchdata = async function (queries, successCallback) {
    const /** {String} */ query = queries?.join("&")
        .replace(/,/g, "=")
        .replace(/ /g, "%20")
        .replace(/\+/g, "%2B");

    const /** {String} */ url = `${ACCESS_POINT}?app_id=$
    {APP_ID}&app_key=${API_KEY}&type=${TYPE}${query ? `&${query}` : ""}`;

    const /** {Object} */ reponse = await fetch(url);

    if (reponse.ok) {
        const data = await reponse.json();
        successCallback(data);
    }
}