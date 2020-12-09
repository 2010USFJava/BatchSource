import { Component, OnInit } from '@angular/core';
import { Pokemon } from 'src/app/pokemon';
import { PokeapiService } from '../pokeapi.service';

@Component({
  selector: 'app-search-pokemon',
  templateUrl: './search-pokemon.component.html',
  styleUrls: ['./search-pokemon.component.css']
})
export class SearchPokemonComponent implements OnInit {
  /*Creating an instance of type Pokemon. This will be sourced/ built from the PokeAPI.
    The JSON returned has a LOT of info, but we only need (want) these 2 pieces of data.
    We will send this to the pokemon-details component so they can display.
  */

 
 pokemon:Pokemon={
  //Setting these to empty strings so the app compiles. will break if we set to property values. 
  //We will use the button and event listener to pass in and display the info
      name:"",
      sprites:{
        front_default:""
      }
    };


  constructor(private pokeapiService:PokeapiService) { }

  ngOnInit(): void {
  }

  onClick():void{
    this.pokeapiService.getPokemonByName(this.pokemon.name).subscribe(res => this.pokemon=res);
  }
}
