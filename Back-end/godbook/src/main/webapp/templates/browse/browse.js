$(document).ready(function () {

    function sucessCallback(response) {

        var test2 = "";

        response.forEach(element => {

            console.log(element.name);
            test2 = ' <div><a class="nav-link" href="http://192.168.1.14:8080/'+ element.id + '"><button id="cardsytle" class="card mb-3" style="max-width: 540px;"><div class="row g-0"><div id="photo" class="col-md-4"><img src="templates/profile/'+ element.id + '.jpg" width="100px" height="100px" class="img-fluid rounded-start" alt="..."></div><div id="giver" class="col-md-8"><div class="card-body"><h5 id="giverName" class="card-title">' + element.name + '</h5><p id="description" class="card-text"> ' + element.description + '</p><p class="card-text"><small id="category" class="text-muted"></small></p></div></div></div></button></a></div>';

            $('#cards').append(test2);

        });

    };



    function errorCallback(request, status, error) { }

    $.ajax({
        url: 'http://192.168.1.14:8080/api',
        async: true,
        success: sucessCallback,
        error: errorCallback
    });
});

