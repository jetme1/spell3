document.addEventListener("keypress", function (event) {

    if (event.key == "Enter" || event.keyCode == 13) {
        (event.preventDefault());

        document.getElementById("enter").click();
    }
});