import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, throwError } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Player } from '../models/player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {


  private url = environment.baseUrl + "api/players";

  constructor(
    private http:HttpClient

  ) { }


  index(): Observable<Player[]>  {
    return this.http.get<Player[]>(this.url).pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError(
          () => new Error('PlayerService.index(): error retrieving todos: ' + err)
        );
      })
    );
  }


}
