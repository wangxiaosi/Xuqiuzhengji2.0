// ҳ�������ɺ����
        $(function(){
            // Ϊ���еĸ��ڵ���ӵ���¼�
        	$(".tree_content").on('click','.tree_node_parent_checkbox',function(){
                // ��ȡ���ڵ��Ƿ�ѡ��
                var isChange = $(this).prop("checked");
                if(isChange){ // ���ѡ��,�򸸽ڵ��µ����е��ӽڵ㶼ѡ��
                    // ��ȡ��ǰcheckbox�ڵ���ֵܽڵ��µ����е�checkbox�ӽڵ�ѡ��
                    $(this).next().find(".tree_node_child_checkbox").prop("checked", true);
                }else{ // δѡ�У�ȡ��ȫѡ
                    // ��ȡ��ǰcheckbox�ڵ���ֵܽڵ��µ����е�checkbox�ӽڵ�ѡ��
                    $(this).next().find(".tree_node_child_checkbox").removeAttr("checked");
                }
            });
            // Ϊ���е��ӽڵ���ӵ���¼�
            $(".tree_content").on('click','.tree_node_child_checkbox',function(){
                // ��ȡѡ�еĽڵ�ĸ��ڵ��µ������ӽڵ�ѡ�е�����
            	var length = $(this).parent().find(".tree_node_child_checkbox:checked").length;
                // �жϵ�ǰ����Ƿ�ѡ��
                if($(this).prop("checked")){ // ѡ��
                    // �����ǰ�ڵ�ѡ�к�,���е�ѡ�нڵ�����1��ѡ�и��ڵ�
                    if(length == 1){
                        // ѡ�и��ڵ�
                        $(this).parent().prev().prop("checked", true);
                    }
                }else{ // �ڵ�δѡ��
                    if(length == 0){
                        // ȡ�����ڵ��ѡ��״̬
                        $(this).parent().prev().removeAttr("checked");
                    }
                }
            });

            // Ϊ���е��л���ť��ӵ���¼�
            $(".tree_content").on('click','.tree_node_toggle_button',function(){
            	//��ajax����ǰ���ڵ����Ϣ���ظ���̨��Ȼ���ȡ������Ӧ�ڵ㣬�ٷ��ػ�������ʾ��Ӧ�ڵ���ӽڵ�
            	//������Ϣ����
            	var html = "";
            	var a = null;
            	var $a = $(this).attr('id');//��ȡ��ť��id
            	a = $a;
            	a = a.substring(23);//��ȡ���һλ���ͳ�ȥ����������Ӧ����Ϣ
            	$.ajax({
                    type: "POST",
                    cache: false,
                    dataType:"json",
                    url: "showShu1" , 
                    data:{
                    	tiaojian:a
                    },
	            	success : function(json1) 
					{
						var first3=null;
						var first1=null;
						/*alert("1");
						alert(json1.code.length);*/
						for(var i=0;i<json1.code.length;i++)
						{ 
							//�س�����һ���ַ������ڵ�ģ���һ��id
							first3 = json1.code[i].substring(0, 3);
							first1 = json1.code[i].substring(0, 1);
							var h = "<div class='tree_node_child' id='tree_node_child" + first3 + "'><input type='checkbox' class='tree_node_child_checkbox' id='tree_node_child_checkbox" + first3 + "'>" + json1.name[i] + "<br></div>";
							html +=h;
						}
				    	$("#tree_node"+ first1 +"").append(html);
	                 }
                });
            	// ��ȡ��Ҫ���ػ���ʾ�Ľڵ�
                var $toggle_node = $(this).parent().next().find("#tree_node_parentA");
                $toggle_node.toggle(); // �л����ػ���ʾ
                // �л���ť����ʾ
                if($toggle_node.is(":visible")){
                    $(this).val("-");
                }else{
                    $(this).val("+");
                }
            });
        });
             
