export class VerificarPalabraService {
  private normalizarPalabra(palabra: string): string {
    return palabra
      .normalize('NFD') 
      .replace(/[\u0300-\u036f]/g, '') 
      .toLowerCase(); 
  }

  public esPalabraInvertida(s: string, t: string): string {
    const palabraNormalizada = this.normalizarPalabra(s);
    const palabraInvertida = palabraNormalizada.split('').reverse().join('');
    return palabraInvertida === this.normalizarPalabra(t) ? 'SÍ' : 'NO';
  }
}

