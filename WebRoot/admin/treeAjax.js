/*涓�骇鐩綍鍔犺浇*/
$(function() {
		var html = "";
		$.ajax({
					url : "showShu",
					type : "post",
					dataType : "json",
					success : function(json) 
					{
						var first=null;
						for(var i=0;i<20;i++)
						{ 
							/*截取第一个字母*/
							first = json.code[i].substring(0, 1);
					    	html +="<input type='button' value='+' class='tree_node_toggle_button' style='float:left'><li class='tree_node' id='tree_node" + first + "' style='float:right'><a href='' target='frmright'>"+ json.name[i] + "</li>";
						}
				    	$(".tree_content").append(html);
                     }
				});
});

/*$(function() {
	var html = "";
	$.ajax({
				url : "showGui",
				type : "post",
				dataType : "json",
				success : function(json) {
									    	html ="<div class='tree_node_child'><input type='checkbox' class='tree_node_child_checkbox'>瀛愯妭鐐�<br></div>";		    	
									    	$(".tree_node_parent").append(html);
                            }
									});
				});*/
/*
<div class="div_inline"><input type="button" value="-" class="tree_node_toggle_button"></div>
<div class="div_inline tree_node_parent">
    <input type="checkbox" class="tree_node_parent_checkbox">锟斤拷锟节碉拷1
    <div class="tree_node_child">
        <input type="checkbox" class="tree_node_child_checkbox">锟接节碉拷1<br>
        <input type="checkbox" class="tree_node_child_checkbox">锟接节碉拷2<br>
        <input type="checkbox" class="tree_node_child_checkbox">锟接节碉拷3<br>
    </div>
</div>
*/