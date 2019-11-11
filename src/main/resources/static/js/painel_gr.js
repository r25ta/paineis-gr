
	function doLoad() {
		console.log("doLoad acionado");
		setTimeout("refresh()", 10 * 1000);
		
	}
	
	function refresh() { 
		console.log("Refresh acionado"); 
		// this.window.location.protocol + this.window.location.host +
		// this.window.location.pathname;
		doLoad();
	}

	var myVar = setInterval(myTimer, 5000);

	function myTimer() {
		var d = new Date();
		document.getElementById("atualizaExecucao").innerHTML = d.toLocaleTimeString();
	}
