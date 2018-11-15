$("#keyword2").on( 'change',function(){
	$("#initiativeByKeywords_form\\:keyword").val($("#keyword2").val())
});

$("#keywordInsert").on( 'change',function(){
	$("#addInitiative\\:keywordIn").val($("#keywordInsert").val())
});

$('#select').on('change', function() {
	$(".status").val($('#select').val());
});


$(document).ready(function() {
    $("#initiativeTable").DataTable();
} );