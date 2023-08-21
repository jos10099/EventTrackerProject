export class Player {
  id: number;
  name: string;
  weapon: string;

  constructor(
  id: number = 0,
  name: string = '',
  weapon: string = ''
  ){
    this.id = id;
    this.name = name;
    this.weapon = weapon;
  }
}
