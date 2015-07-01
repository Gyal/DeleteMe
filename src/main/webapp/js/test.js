/**
 * Created by Mélina on 01/07/2015.
 */
var donné;

var data = {q: 'melina', format: 'json', pretty: 1};
$.ajax({
    url: "https://api.duckduckgo.com",
    type: "GET",
    data: {q: 'JavaScript', format: 'json', pretty: 1},
    crossDomain: true,
    dataType: 'jsonp',
    success: function (data) {
        donné = JSON.stringify(data)
        document.getElementById("test").value = donné;
    }
});


var options = {

    url: function (phrase) {
        if (phrase !== "") {
            return "http://api.duckduckgo.com/?q=" + phrase + "&format=json&pretty=1";
        } else {
            //duckduckgo doesn't support empty strings
            return "http://api.duckduckgo.com/?q=empty&format=json";
        }
    },

    getValue: "Text",

    ajaxSettings: {
        dataType: "jsonp"
    },

    listLocation: "RelatedTopics",

    theme: "round"
};

$("#example-ddg").easyAutocomplete(options);
