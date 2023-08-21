import { PlayerService } from './../../services/player.service';
import { Player } from './../../models/player';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

playerList: Player[] = [];

  constructor(
    private playerService: PlayerService
  ){}

  ngOnInit(): void {

  }

  reload() {
    this.playerService.index().subscribe({
      next: (list) => {

      },
      error: (fail) => {
        console.error('Home.Component.reload(): error getting players');
        console.error(fail);
      }
    });
  }
}
