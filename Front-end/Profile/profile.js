$(document).ready(function () {
    var giver;



    function successCallback(response) {

        giver = response;

        $("#name").append(giver.name);
        $("#phoneNumber").append(giver.phoneNumber);
        $("#email").append(giver.email);
        $("#aboutMe").append(giver.aboutMe);
        $("#category").append(giver.category);
        $("#skills").append(giver.skills);
        $("#experiences").append(giver.experiences);
        $("#location").append(giver.location);
        $("#age").append(giver.age);

        var src1 = giver.imgUrl;
        $("#photo").attr("src", src1);
    }

    function errorCallback(request, status, error) {
        console.log(error);
    }

    // perform an ajax http get request
    $.ajax({
        url: 'http://192.168.1.14:8080/api/1',
        crossOrigin: true,
        async: true,
        success: successCallback,
        error: errorCallback
    });

});