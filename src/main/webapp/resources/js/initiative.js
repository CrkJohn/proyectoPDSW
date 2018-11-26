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


///PROBANDO COSAS
function format ( item ) {
    // `d` is the original data object for the row       
    return '<h5> La iniciativa fue propuesta en la siguiente fecha por'+
	    	', teniendo en cuenta la información de esta:'+
				'<br></br><br></br>'+

				'Se revisara y estudiará de forma tal que se pueda solucionar lo que se esta presentado o se vera la posiblidad de poder añadir lo que se solicita si esto es lo que se desea.'+
				'<br></br>'+
				'Última fecha de modificación: .'+
			'</h5>'+
			'<br/>'+
	         		'<h:panelGroup layout="block" rendered="#{ userBean.islogged()}">'+
						'<p:button type="button" class="btn btn-primary" outcome="initiative?initiative="'+item.id+'" value= "Ver mas"/>'+
					'</h:panelGroup>'+
					'<h:panelGroup layout="block" rendered="#{ userBean.isAdmin()}">'+
						'<button type="button" data-id="'+item.name+'" class="modify-Initiative btn btn-primary" data-toggle="modal" data-target="#modifyInitiative">Modificar</button>'+
					'</h:panelGroup>'+

	         	'</td>'+
	        '</tr>';
}

$(document).ready(function() {
    var table = $('#initiativeTable').DataTable();
     
    // Add event listener for opening and closing details
	$('#initiativeTable tbody').on('click', 'td.details-control', function () {
	    var tr = $(this).closest('tr');
	    var row = table.row(tr);
	    if ( row.child.isShown() ) {
	        // This row is already open - close it
	        row.child.hide();
	        tr.removeClass('shown');
	    }
	    else {
	        row.child('Hola');
	        row.child(format(row.data())).show();
	        tr.addClass('shown');
	    }
	} );
} );







