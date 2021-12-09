$(document).ready(function () {
    var giver = {
        name: "Bruno Januário",
        phoneNumber: 911776058,
        email: "bruno.januario1998@gmail.com",
        aboutMe: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
        imgUrl: "./photo.jpeg",
        category: "Sport",
        skills: "Soccer",
        experiences: "Coach",
        location: "Porto",
        age: 23
    }

    $("#name").append(giver.name);
    $("#phoneNumber").append(giver.phoneNumber);
    $("#email").append(giver.email);
    $("#aboutMe").append(giver.aboutMe);
    $("#category").append(giver.category);
    $("#skills").append(giver.skills);
    $("#experiences").append(giver.experiences);
    $("#location").append(giver.location);
    $("#age").append(giver.age);

    var src1 = 'photo.jpeg';
    $("#photo").attr("src", src1);

});