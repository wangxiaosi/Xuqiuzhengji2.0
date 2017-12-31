/*一级目录加载*/
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
							/*截出来第一个字符来给节点模块加一个id*/
							first = json.code[i].substring(0, 1);
					    	html +="<div class='tree_node' id='tree_node" + first + "'><div class='div_inline'><input type='button' value='+' class='tree_node_toggle_button' id='tree_node_toggle_button" + first + "'></div><div class='div_inline tree_node_parent' id='tree_node_parent" + first + "'><input type='checkbox' class='tree_node_parent_checkbox' id='tree_node_parent_checkbox" + first + "'>" + json.name[i] + "</div></div>";
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
									    	html ="<div class='tree_node_child'><input type='checkbox' class='tree_node_child_checkbox'>子节点1<br></div>";		    	
									    	$(".tree_node_parent").append(html);
                            }
									});
				});*/
/*
<div class="div_inline"><input type="button" value="-" class="tree_node_toggle_button"></div>
<div class="div_inline tree_node_parent">
    <input type="checkbox" class="tree_node_parent_checkbox">���ڵ�1
    <div class="tree_node_child">
        <input type="checkbox" class="tree_node_child_checkbox">�ӽڵ�1<br>
        <input type="checkbox" class="tree_node_child_checkbox">�ӽڵ�2<br>
        <input type="checkbox" class="tree_node_child_checkbox">�ӽڵ�3<br>
    </div>
</div>
*/