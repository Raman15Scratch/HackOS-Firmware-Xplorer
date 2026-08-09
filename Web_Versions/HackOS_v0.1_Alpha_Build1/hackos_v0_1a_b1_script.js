const fileButton = document.getElementById("fileButton");
const helpButton = document.getElementById("helpButton");

const fileMenu = document.getElementById("fileMenu");
const helpMenu = document.getElementById("helpMenu");

const openButton = document.getElementById("openButton");
const exitButton = document.getElementById("exitButton");

const aboutButton = document.getElementById("aboutButton");

const aboutDialog = document.getElementById("aboutDialog");

const aboutClose = document.getElementById("aboutClose");
const aboutX = document.getElementById("aboutX");


fileButton.addEventListener("click", function () {

    if (fileMenu.style.display === "block") {
        fileMenu.style.display = "none";
    } else {
        fileMenu.style.display = "block";
        helpMenu.style.display = "none";
    }

});


helpButton.addEventListener("click", function () {

    if (helpMenu.style.display === "block") {
        helpMenu.style.display = "none";
    } else {
        helpMenu.style.display = "block";
        fileMenu.style.display = "none";
    }

});


openButton.addEventListener("click", function () {

    fileMenu.style.display = "none";

});


exitButton.addEventListener("click", function () {

    fileMenu.style.display = "none";

});


aboutButton.addEventListener("click", function () {

    helpMenu.style.display = "none";

    aboutDialog.style.display = "flex";

});


aboutClose.addEventListener("click", function () {

    aboutDialog.style.display = "none";

});


aboutX.addEventListener("click", function () {

    aboutDialog.style.display = "none";

});


document.addEventListener("click", function (event) {

    if (!event.target.closest(".menu-container")) {

        fileMenu.style.display = "none";
        helpMenu.style.display = "none";

    }

});
