import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.scss']
})
export class ProductListComponent {

  products = [
    {
      id: 1,
      name: 'Laptop',
      price: 149000,
      description: 'New Pro',
      isAvailable: true,
      imagePath: 'assets/Laptop.png'
    },
    {
      id: 2,
      name: 'Mobile',
      price: 14000,
      description: 'New Model',
      isAvailable: true,
      imagePath: 'assets/Mobile.png'
    },
  ]


}