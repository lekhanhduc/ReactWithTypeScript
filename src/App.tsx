import React from 'react';
import './App.css';
import { Navar } from './layouts/NavbarAndFooter/Navbar';
import { Footer } from './layouts/NavbarAndFooter/Footer';
import { HomePage } from './layouts/HomePage/HomePage';

export const App = () => {
  return (
    <div>
      <Navar />
      <HomePage/>
      <Footer/>
    </div>
  );
}
