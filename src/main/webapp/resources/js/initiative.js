$("#keyword2").on( 'change',function(){
	$("#initiativeByKeywords_form\\:keyword").val($("#keyword2").val())
});

$('#select').on('change', function() {
	$(".status").val($('#select').val());
});


$(document).ready(function() {
    $("#initiativeTable").DataTable();
	$("#keyinitiative").DataTable();
} );

$("#keyinitiative").load(function(){
	$("#keyinitiative").DataTable();
});