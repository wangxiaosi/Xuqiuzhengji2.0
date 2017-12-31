$(function() {
		var power;
		var html = "";
		$.ajax({
					url : "../powerControl",
					type : "post",
					dataType : "json",
					success : function(data) {
						$.each(
								data,
								function(i, item) {
									power = item.power;
								$("#category").html(html);
								});
                                }
										});
					});