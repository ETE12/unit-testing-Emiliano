import { VerificarPalabraService } from './translation.component';

describe('VerificarPalabraService', () => {
  let service: VerificarPalabraService;

  beforeEach(() => {
    service = new VerificarPalabraService();
  });

  it('should return "SÍ" for s="código" and t="ogidóc"', () => {
    const result = service.esPalabraInvertida('código', 'ogidóc');
    expect(result).toBe('SÍ');
  });

  it('should return "NO" for s="abb" and t="aba"', () => {
    const result = service.esPalabraInvertida('abb', 'aba');
    expect(result).toBe('NO');
  });

  it('should return "NO" for s="código código" and t="código"', () => {
    const result = service.esPalabraInvertida('código código', 'código');
    expect(result).toBe('NO');
  });
});
