import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Pokemon } from './pokemon';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PokeapiService {
  /*We will use this service to actually call the PokeAPI. Much like
  we used AJAX before. We add an instance of HttpClient (which
  must be imported from Angular/common/http) to act as our
  new and improved XHR. 

*/
  constructor(private httpService:HttpClient) { }
  //Remember from TS: adding an access modifer to the constructor 
  //will add that property to the TS class.  
  
  /*Create a method to call the PokeAPI, provide a name, and return
    a JSON for that specific pokemon. Be sure to import the Pokemon 
    interface we created. 
  */
 getPokemonByName(name:string):Observable<Pokemon>{
  return this.httpService.get<Pokemon>(`https://pokeapi.co/api/v2/pokemon/${name}`);
  /*This method returns an Observable which is used to handle a 
    variety of common asynchronous operations. The HTTP module uses
    observables to handle AJAX requests and responses. 
  */
 }
}
