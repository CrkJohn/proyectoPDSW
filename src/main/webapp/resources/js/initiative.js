$("#keyword2").on( 'change',function(){
	$("#initiativeByKeywords_form\\:keyword").val($("#keyword2").val())
});

$("#keywordInsert").on( 'change',function(){
	$("#addInitiative\\:keywordIn").val($("#keywordInsert").val())
});

$("#description_initiative\\:boton").on( 'click',function(){
	$("#description_initiative\\:idInitiative").val($("#idInitiative").val())
});

$('#select').on('change', function() {
	$(".status").val($('#select').val());
});

$("#modifyInitiative").on('shown.bs.modal', function(){
	$("#InitiativeStatus\\:inStatus").val($("#inStatus").val())
});


$(document).ready(function() {
    $("#initiativeTable").DataTable();
	$("#keyinitiative").DataTable();
	$("#interestedTable").DataTable();
	$("#commentTable").DataTable();
	$("#relatedTable").DataTable();
	$("#myInitiativeTable").DataTable();
} );

$(document).on("click", ".open-DescriptionInitiative", function () {
     var initiativeId = $(this).data('id');
     $(".modal-body #idInitiative").val( initiativeId );
});


$(document).on("keypress", ":input", function(event) {
    if (event.keyCode == 13) {
        event.preventDefault();
    }
});

$(document).on("click", ".modify-Initiative", function () {
     var inStatus = $(this).data('id');
     $(".modal-body #inStatus").val( inStatus );
});
