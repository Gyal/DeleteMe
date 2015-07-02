/**
 * Created by Mélina on 01/07/2015.
 */

/* Fonction recherche */
var donné;

function search(keyword) {

    $.ajax({
        url: "https://api.duckduckgo.com",
        type: "GET",
        data: {q: keyword, format: 'json', pretty: 1},
        crossDomain: true,
        dataType: 'jsonp',
        success: function (data) {
            //Transfort l'objet JQUERY en JSON
            donné = JSON.stringify(data);
            // Parse l'objet JSON
            var json = JSON.parse(donné);
            //Insert une DIV après le label de la page test
            $("#labelSearch").after("<div style='margin-left:20%'  class=well id='search'><h3><b>Résultat de la recherche:</b></h3>")

            //Pour chaque résultat,ajout du contenu à la div search
            for (var i = 0; i < donné.length; i++) {
                var link = json.RelatedTopics[i].Result
                //alert(link);
                if(document.getElementById("search")==null){
                    $("#search").append("<h4 style='margin-left:20%'><b>Lien trouvé:</b> " + link + "</h4>");
                }else{
                    $("#search").html("<h4 style='margin-left:20%'><b>Lien trouvé:</b> " + link + "</h4>");
                }
            }
        }
    });
}

/*Fonction recherche + information */
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
