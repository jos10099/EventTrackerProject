console.log('script.js loaded.')

window.addEventListener('load', function(e) {
	console.log('Page loaded.');
	init();

});
function init() {
	loadPlayerList();

}


function loadPlayerList() {
	let xhr = new XMLHttpRequest();
	xhr.open('GET', 'api/players');
	xhr.onreadystatechange = function() {

		if (xhr.readyState === 4) {
			if (xhr.status === 200) {
				let players = JSON.parse(xhr.responseText);
				console.log(players);
				displayPlayerList(players);


			}
			else {
				// Display Error on page?
				// Silently do nothing?
			}
		}
	};
	xhr.send();
}






function displayPlayerList(playerList) {
	if (playerList && Array.isArray(playerList)) {
		let tbody = document.getElementById("playerTableBody");
		for (let player of playerList) {
			let tr = document.createElement('tr');
			let td;
			td = document.createElement('td');
			td.textContent = player.id;
			tr.appendChild(td);
			td = document.createElement('td');
			td.textContent = player.name;
			tr.appendChild(td);
			tbody.appendChild(tr);

			tr.addEventListener('click', function(e) {
				let element = e.target;
				let playerId = element.parentElement.firstElementChild.textContent;
				console.log(element);
				getPlayerDetails(playerId);
				
			});

		}
	}

}
function getPlayerDetails(playerId) {
	
}

function displayPlayerDetails(player) {
	
}


