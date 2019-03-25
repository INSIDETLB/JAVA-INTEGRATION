$(function(){
/*	var height=$(window).height();
	$("body").css({"height":height});
	$("#img").css({"height":height});*/

	$('#myModal').modal({backdrop: 'static', keyboard: false});
	$('#myModal').modal("show");
	$(".modal-backdrop")[0].style.display="none";
	$(".modal").css({"position": "fixed","top": "23%","right": 0,"bottom": 0,"left": 0,"z-index": 1050,"outline": 0});
	
	$("#imgVerify").trigger("click");
	$("#myModal").css({"display": "block","padding-left": "17px"});
})
//获取验证码
function getVerify(obj){
	
 obj.src = "/SSOPersonnelLogin/login=getVerify.do?"+Math.random();
 
}

function login(){
	$("form").attr("action","/");
}





